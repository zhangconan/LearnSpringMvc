package com.zkn.learnspringmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String home(Model modelMap){
		/**
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "�������ҳ!!!");
		mv.setViewName("home");
		*/
		modelMap.addAttribute("message", "这个是首页!!!");
		modelMap.addAttribute("errorMessage", "这个是首页!!!");
		return "home";
	}
}
