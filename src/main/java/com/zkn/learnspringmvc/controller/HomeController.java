package com.zkn.learnspringmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author zkn 2016-05-16
 *
 */
@Controller
public class HomeController {

	@RequestMapping(value="/home.do")
	public String processHomeController(Map<String,Object> modelMap){
		/**
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "这个是首页!!!");
		mv.setViewName("home");
		*/
		modelMap.put("message", "这个是首页!!!");
		return "home";
	}
}
