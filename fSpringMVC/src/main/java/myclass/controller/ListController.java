package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import myclass.model.MemberVO;
import myclass.model.MemberVOList;

@Controller
public class ListController {

	@RequestMapping("multiInsert.do")
	public String test(MemberVOList memberVOList) {
		for(MemberVO vo : memberVOList.getList()) {
			System.out.println(vo.isState()+" : "+vo.getId()+" "+vo.getAge()+"-"+vo.getName());
		}
		
		return "multiInsert";
	}
	
}
