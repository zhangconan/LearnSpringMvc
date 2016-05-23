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
	/**
	 * 注解第一种写法
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value="/home1.do")
	public String home(Model modelMap){
		modelMap.addAttribute("message", "这个是首页!!!");
		modelMap.addAttribute("errorMessage", "这个是首页!!!");
		return "home";
	}
	/**
	 * 注解第二种写法
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value="/home2.do")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "这是第二个首页");
		mv.addObject("errorMessage", "这是第二个首页错误页面");
		mv.setViewName("home");
		return mv;
	}
	/**
	 * 注解第三种写法
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value="/home3.do")
	public String home2(Map<String, Object> map){
		map.put("message", "这是home3.do");
		map.put("errorMessage", "home3.do");
		return "home";
	}
}
