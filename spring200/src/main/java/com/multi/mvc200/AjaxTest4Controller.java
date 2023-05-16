package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;	
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxTest4Controller {

	@RequestMapping("jsonResponse3")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public MemberVO jsonResponse3() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag; 
	}
	
	@RequestMapping("jsonResponse4")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public ArrayList<MemberVO> jsonResponse4() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		
		MemberVO bag2 = new MemberVO();
		bag2.setId("seo");
		bag2.setPw("beom");
		bag2.setName("sik");
		bag2.setTel("999");
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;
	}

	@RequestMapping("jsonResponse5")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public MapVO kakaoVap() {
		MapVO bag = new MapVO();
		bag.setLat(37.5117);
		bag.setLon(127.0592);
		
		System.out.println(bag);
		
		return bag;
	}
	
	@RequestMapping("jsonResponse6")
	@ResponseBody
	public ArrayList<ChartVO> json6() {
		ArrayList<ChartVO> list = new ArrayList<ChartVO>();
		
		ChartVO vo = new ChartVO();
		vo.setWork("study!");
		vo.setTime(10);
		list.add(vo);
		
		ChartVO vo2 = new ChartVO();
		vo2.setWork("run!");
		vo2.setTime(5);
		list.add(vo2);
		
		ChartVO vo3 = new ChartVO();
		vo3.setWork("eat!");
		vo3.setTime(7);
		list.add(vo3);
		
		return list;
	}
}