package com.multi.mvc300;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	@RequestMapping("insert3.multi")
	public void insert(BookVO bag) {
		System.out.println(bag);
		
		int result = dao.insert(bag);
		System.out.println(result);
	}
	
	@RequestMapping("delete3.multi")
	public void delete(int id) {
		System.out.println(id);
		
		int result = dao.delete(id);
		System.out.println(result);
	}
	
	@RequestMapping("update3.multi")
	public void update(BookVO bag) {
		System.out.println(bag);
		
		int result = dao.update(bag);
		System.out.println(result);
	}
	
	@RequestMapping("one3.multi")
	public void one(int id, Model model) {
		System.out.println(id);
		
		BookVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list3.multi")
	public void list(Model model) {
		List<BookVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
