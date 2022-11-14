package mm.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mm.domain.EmpVO;
import mm.service.EmpServiceImpl;

@Controller
public class EmpController {
	
	@Autowired
	private EmpServiceImpl empService;

	@RequestMapping("empSelect.do")
		public String empSelect(Model m) {
		
		List<EmpVO> list = empService.empSelect();
		m.addAttribute("result", list);
		
		return "empSelect";
	}
	
	
	@RequestMapping("empDept.do")
	public void empDept(Model m) {
		List<HashMap> result = empService.empDept();
		m.addAttribute("result", result);
		for (HashMap map : result) {
			System.out.println(map);
		}
	}
}


/*
 * 
 *  뷰 페이지 리턴 방식
 * MapAndView
 * String
 * Void
 * 
 */