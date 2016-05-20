package com.zkn.learnspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * 类名字映射处理器
 * 访问路径为：http://localhost:8080/LearnSpringMvc/classname
 * @author wb-zhangkenan
 *
 */

public class ClassNameController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "这个是ClassNameController");
		mv.setViewName("home");
		return mv;
	}

	
}
