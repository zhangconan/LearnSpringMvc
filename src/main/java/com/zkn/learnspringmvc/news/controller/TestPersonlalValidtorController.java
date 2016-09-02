package com.zkn.learnspringmvc.news.controller;

import com.zkn.learnspringmvc.scope.PersonScope;
import com.zkn.learnspringmvc.validtor.PersonalValidtor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * 用来测试PersonalValidator的控制器
 * Created by wb-zhangkenan on 2016/9/2.
 */
@Controller
public class TestPersonlalValidtorController {

    //绑定PersonalValidator
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addValidators(new PersonalValidtor());
    }

    @RequestMapping(value = "testPersonalValidtor.do",method = RequestMethod.GET)
    @ResponseBody
    public String testPersonalValidtor(@Valid PersonScope personScope, BindingResult bindingResult, HttpServletResponse response){
        response.setCharacterEncoding("utf-8");
        if(bindingResult.hasErrors()){
            StringBuffer sb = new StringBuffer();
            sb.append(bindingResult.getAllErrors());
            return sb.toString();
        }else{
            return "zhangsan";
        }
    }
}
