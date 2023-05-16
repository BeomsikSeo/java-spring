package com.multi.mvc300;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MockDAO {
	
	@Autowired
	SqlSessionTemplate my;

	public List<MockVO> list() {

		List<MockVO> list = my.selectList("mock.all");
		return list;
	}
	
	public MockVO one(String code) {

		MockVO bag = my.selectOne("mock.one", code);
		System.out.println(bag);
		return bag;
	}
	
	public int delete(String code) {

		int result = my.delete("mock.delete", code);
		return result;
	}

	public int update(MockVO bag) {

		int result = my.update("mock.update", bag);
		return result;
	}

	public int insert(MockVO bag) {

		int result = my.insert("mock.create", bag);
		return result;
	}

}
