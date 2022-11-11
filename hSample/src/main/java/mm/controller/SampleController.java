package mm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mm.service.SampleServiceImpl;

@Controller
public class SampleController {

	
	@Autowired
	SampleServiceImpl service;
	
	@RequestMapping("sample.do")
	public String sample(Model m) {
		String serverTime =service.sample();
		m.addAttribute("serverTime", serverTime);
		return "home";
	}
	
}
