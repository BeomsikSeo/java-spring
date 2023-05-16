package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	@RequestMapping("json1")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public MemberVO json1() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag; // {"id" : "root", "pw" : "1234", "name" : "hong", "tel" : "011"}
	}

	@RequestMapping("json2")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public ArrayList<MemberVO> json2() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");

		MemberVO bag2 = new MemberVO();
		bag2.setId("root");
		bag2.setPw("1234");
		bag2.setName("hong");
		bag2.setTel("011");

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);

		return list;
	}

	@RequestMapping("json3")
	@ResponseBody
	public BbsVO json3() {
		BbsVO vo = new BbsVO();
		vo.setNo(1);
		vo.setContent("content");

		return vo;
	}

	@RequestMapping("json4")
	@ResponseBody // 요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public ArrayList<BbsVO> json4() {
		BbsVO vo = new BbsVO();
		vo.setNo(1);
		vo.setContent("content");

		BbsVO vo2 = new BbsVO();
		vo2.setNo(1);
		vo2.setContent("content");

		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(vo);
		list.add(vo2);

		return list;
	}
}