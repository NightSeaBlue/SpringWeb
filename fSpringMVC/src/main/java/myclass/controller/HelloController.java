package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("start.do")
	public ModelAndView test() {
		System.out.println("요청받음");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","즐거운 하루 = 코딩 어려울 때");
		mv.addObject("data", "쥬우우운내게 중요한 데이타");
		mv.setViewName("secret");
		// /WEB-INF/views/ + secret + .jsp
		return mv;
	}
	
}
