package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("insert.do")
	public String insert() {
		System.out.println("입력완료");
		//*********************************
		//return "select";
		//리다이렉팅 (해당 하는 페이지를 실행하기를 재요구)
		return "redirect:select.do";
	}
	
	@RequestMapping("select.do")
	public void select(Model m) {
		System.out.println("검색완료");
		m.addAttribute("info", "끼야아아아악");
	}
}
