package com.zkn.learnspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class BeanNameController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "这是BeanNameController");
		mv.addObject("errorMessage", "这是第二个首页错误页面");
		mv.setViewName("home");
		return mv;
	}
}
