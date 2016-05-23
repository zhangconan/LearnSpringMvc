package com.zkn.learnspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * 测试SimpleURL
 * @author zkn 2016-05-23 
 *
 */

public class SimpleUrlController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "这是SimpleUrlController");
		mv.addObject("errorMessage", "这是SimpleUrlController");
		mv.setViewName("home");
		return mv;
	}
}
