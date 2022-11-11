package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
 *	모델(데이터)를 뷰페이지로 전송
 *
 *  	1. ModelAndView 리턴
 *  		- addObject()
 *  
 *   	2. Model을 호출 함수의 인자로 선언
 *   		- addAttribute()
 * 			
 */


@Controller
@RequestMapping("review/")
public class ReviewController {

	@RequestMapping("modelandview.do")
	public ModelAndView review() {
		//1. ModelAndView 뷰페이지 지정
		ModelAndView mv = new ModelAndView();
		mv.setViewName("review/void");
		mv.addObject("A", "ㅎㅎ");
		mv.addObject("C", "최백호 앨범좋아");
		return mv;
	}
	
	@RequestMapping("string.do")
	//***************************************
	// Model : View 로 Data를 전송해주는 전송객체
	//	=> 이뇨속을 인자에 지정을 하면 이뇨속이 View 로 전송됨
	public String review2(Model m) {
		// 2. 문자열 리턴 뷰 페이지 지정
		m.addAttribute("A", "아이네");
		m.addAttribute("C","노래잘해요");
		
		return "review/void";
	}
	
	@RequestMapping("void.do")
	public void review3(Model m) {
		// 3. void 리턴 뷰 페이지 지정
		//요청명과 동일한 뷰 페이지 지정
		m.addAttribute("A", "카즈하");
		m.addAttribute("C","예뻐요");
	}
	
	
}
