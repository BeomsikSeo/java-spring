package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;

	@Autowired
	ReplyDAO dao2;
	
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
	
	@RequestMapping("update3")
	public void update3(BbsVO bag) {
		System.out.println("update 호출됨.");
		System.out.println(bag);
		
		dao.update(bag);
	}
	
	@RequestMapping("delete3")
	public String delete3(int no) {
		System.out.println("delete 호출됨.");
		System.out.println(no);
		
		int result = dao.delete(no);
		if (result == 1) {
			return "redirect:ajax_test.jsp";
		} else {
			return "delete3";
		}
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one 호출됨.");
		System.out.println(no);
		
		BbsVO bag = dao.one(no);
		// 검색결과가 있는지 프린트!
		System.out.println(bag);
		// bbs 상세페이지 만들 때, reply list도 함께 가지고 와야함.
		ArrayList<ReplyVO> list = dao2.list(no);
		model.addAttribute("list", list);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("one22.multi")
	@ResponseBody
	// views로 넘어가지 않고, Return값이 bag데이터를 json으로 만들어서 클라이언트 전송
	// 클라이언트 부라우저에서는 success: function(x)
	// 결과가 함수의 입력변수인 x로 쏙 들어간다.!
	public BbsVO one22(int no, Model model) {
		System.out.println("one 호출됨.");
		System.out.println(no);
		
		BbsVO bag = dao.one(no);
		// 검색결과가 있는지 프린트!
		System.out.println(bag);
		return bag;
	}
	
	@RequestMapping("one6")
	public void one6(int no, Model model) {
		System.out.println("one 호출됨.");
		System.out.println(no);
		
		BbsVO bag = dao.one(no);
		// 검색결과가 있는지 프린트!
		System.out.println(bag);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list2.multi")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list5")
	public void list5(Model model) {
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list55")
	@ResponseBody
	public ArrayList<BbsVO> list55(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size());
		return list;
	}
}
