package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GradeController {

	@Autowired
	GradeDAO dao;
	
	@RequestMapping("insert4.multi")
	public void insert(GradeVO bag) {
		System.out.println(bag);
		
		int result = dao.insert(bag);
		System.out.println(result);
	}
	
	@RequestMapping("delete4.multi")
	public void delete(int id) {
		System.out.println(id);
		
		int result = dao.delete(id);
		System.out.println(result);
	}
	
	@RequestMapping("update4.multi")
	public void update(GradeVO bag) {
		System.out.println(bag);
		
		int result = dao.update(bag);
		System.out.println(result);
	}
	
	@RequestMapping("one4.multi")
	public void one(int id, Model model) {
		System.out.println(id);
		
		GradeVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list4.multi")
	public void list(Model model) {
		ArrayList<GradeVO> list = dao.list();
		model.addAttribute("list", list);
	}
}
