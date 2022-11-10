package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import myclass.model.MemberVO;

@Controller
public class paramController {
	
	@RequestMapping(value={"param.do","paramForm.do"})
	public void test(MemberVO vo) {
		System.out.println("요청 수행 결과");
		
	}
	
	
	
}
