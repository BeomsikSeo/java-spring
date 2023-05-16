<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src = "resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$(".update").click(function() {
			alert($(this).attr('value'))
			content = prompt('수정할 내용을 입력하세요.')
			$.ajax({
				url: "bbs_update",
				data: {
					no: $(this).attr('value'),
					content: content
				},
				success: function() {
					alert('수정완료!')
					document.location.reload();
				}
			})
		})
		
		$(".delete").click(function() {
			$.ajax({
				url: "bbs_delete",
				data: {
					no: $(this).attr('value')
				},
				success: function() {
					alert('삭제완료!')
					document.location.reload();
				}
			})
		})
	})
</script>
<table style =" border: 1px solid #000; border-collapse: collapse;">
	<tr style =" border: 1px solid #000; border-collapse: collapse;">
		<th style =" border: 1px solid #000; border-collapse: collapse;" >no</th>
		<th style =" border: 1px solid #000; border-collapse: collapse;">title</th>
		<th style =" border: 1px solid #000; border-collapse: collapse;">content</th>
		<th style =" border: 1px solid #000; border-collapse: collapse;">writer</th>
		<th style =" border: 1px solid #000; border-collapse: collapse;" colspan="2">update/delete</th>
	</tr>
	<c:forEach items="${list}" var="bag">
	<tr class = "table_content" style =" border: 1px solid #000; border-collapse: collapse;">
		<td style =" border: 1px solid #000; border-collapse: collapse; padding: 20px;">${bag.no}</td>
		<td style =" border: 1px solid #000; border-collapse: collapse; padding: 20px;">
			<a href = "bbs_one?no= ${bag.no}">${bag.title}</a>
		</td>
		<td style =" border: 1px solid #000; border-collapse: collapse; padding: 20px;">${bag.content}</td>
		<td style =" border: 1px solid #000; border-collapse: collapse; padding: 20px;">${bag.writer}</td>
		<td style =" padding: 20px;">
			<button value = "${bag.no}" type = "button" class ="update">수정</button>
		</td>
		<td style ="padding: 20px;">
			<button value = "${bag.no}" type = "button" class ="delete">삭제</button>
		</td>
	</tr>
	</c:forEach>
</table>