package com.zkn.learnspringmvc.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author zkn 2016-07-14
 *
 */

@Controller
public class FirstLearnAnnotationController {

	@RequestMapping(value="/firstPage.do")
	public ModelAndView firstController(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("firstPage","这是第一个页面zhagnanngnang");
		mv.setViewName("firstPage");
		return mv;
	}
}
