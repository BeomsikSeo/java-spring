package com.multi.mvc300;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MockController {

	@Autowired
	MockDAO dao;
	
	@RequestMapping("insert9.multi")
	public void insert(MockVO bag) {
		System.out.println(bag);
		
		int result = dao.insert(bag);
		System.out.println(result);
	}
	
	@RequestMapping("delete9.multi")
	public void delete(String code) {
		System.out.println(code);
		
		int result = dao.delete(code);
		System.out.println(result);
	}
	
	@RequestMapping("update9.multi")
	public void update(MockVO bag) {
		System.out.println(bag);
		
		int result = dao.update(bag);
		System.out.println(result);
	}
	
	@RequestMapping("one9.multi")
	public void one(String code, Model model) {
		System.out.println(code);
		
		MockVO bag = dao.one(code);
		System.out.println(bag);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list9.multi")
	public void list(Model model) {
		List<MockVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
