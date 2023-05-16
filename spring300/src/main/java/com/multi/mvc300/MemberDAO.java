package com.multi.mvc300;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 테이블 하나당 DAO하나! ==> CUD를 완성!!
// 스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게! 라고 설정해야함.
// 2가지방법으로 할 수 있음.
// 어노테이션(표시)방법, XML방법
@Component // 싱글톤으로 만들어서 ram에 넣어줘
public class MemberDAO { // CRUD
	
	// mybatis 싱글톤 객체 찾아서 주소를 넣어주세요.!
	@Autowired
	SqlSessionTemplate my;
	
// 특정한 방법으로 실행하는 클래스(model, 방법)
	
	// 메서드를 만드는 것 ==> 메서드 정의(define)!
	// 메서드를 정의했다고 실행되는 것은 아니다.!
	// 메서드를 쓰는 것 ==> 메서드 호출(call)!
	
//	 public ArrayList<MemberVO> list() {
//	  
//	 return list;
//	  
//	  }
	  
	  public MemberVO one(String id) {
	  MemberVO bag = my.selectOne("member.one", id);
	  return bag;
	  
	  }
	  
//	  public int login(MemberVO bag) {
//	  
//	  return result;
//	  
//	  }
//	  
	  public int delete(String id) { // memberMapper에 parameterType을 String으로 주어야함.
		  							 // 하지만 MemberVO에 id가 있으면 자동으로 set 후 get으로 꺼냄.
		  int result = my.delete("member.del", id);
		  return result;
	  
	  }
//	  
//	  // 1. 가방을 받아서 저장해두자. // 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.
	  public int update(MemberVO bag) {
		  int result = my.update("member.up", bag);
		  return result;
	  
	 }
	 

	// public void add2() {
	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		//                     namespace.id
		return result;

	}

}
