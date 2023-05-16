package com.multi.mvc300;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookDAO {
	
	@Autowired
	SqlSessionTemplate my;

	public List<BookVO> list() {

		List<BookVO> list = my.selectList("book.all");
		return list;
	}
	
	public BookVO one(int id) {

		BookVO bag = my.selectOne("book.one", id);
		return bag;
	}
	
	public int delete(int id) {

		int result = my.delete("book.delete", id);
		return result;
	}

	public int update(BookVO bag) {

		int result = my.update("book.update", bag);
		return result;
	}

	public int insert(BookVO bag) {

		int result = my.insert("book.create", bag);
		return result;
	}

}
