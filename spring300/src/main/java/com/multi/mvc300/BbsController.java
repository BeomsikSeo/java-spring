package com.multi.mvc300;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {
		System.out.println("insert 호출됨.");
		System.out.println(dao);
		
		dao.insert(bag);
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag) {
		System.out.println("update 호출됨.");
		System.out.println(bag);
		
		dao.update(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(int no) {
		System.out.println("delete 호출됨.");
		System.out.println(no);
		
		dao.delete(no);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one 호출됨.");
		System.out.println(no);
		
		BbsVO bag = dao.one(no);
		model.addAttribute("bag", bag);
	}
//	
//	@RequestMapping("list2.multi")
//	public void list(Model model) {
//		ArrayList<BbsVO> list = dao.list();
//		model.addAttribute("list", list);
//	}
}
