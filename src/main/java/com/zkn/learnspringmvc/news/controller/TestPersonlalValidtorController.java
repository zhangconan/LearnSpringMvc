package com.zkn.learnspringmvc.news.controller;

import com.alibaba.fastjson.JSON;
import com.zkn.learnspringmvc.scope.PersonScope;
import com.zkn.learnspringmvc.validtor.PersonalValidtor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用来测试PersonalValidator的控制器
 * Created by wb-zhangkenan on 2016/9/2.
 */
@Controller
public class TestPersonlalValidtorController {

    //绑定PersonalValidator
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor dateEditor = new CustomDateEditor(sdf,true);
        webDataBinder.addValidators(new PersonalValidtor());
        webDataBinder.registerCustomEditor(Date.class,dateEditor);
    }

    @RequestMapping(value = "testPersonalValidtor.do")
    @ResponseBody
    //直接返回对象
    public Object testPersonalValidtor(@Valid PersonScope personScope, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            StringBuffer sb = new StringBuffer();
            for(ObjectError objectError : bindingResult.getAllErrors()){
                sb.append(((FieldError)objectError).getField() +" : ").append(objectError.getDefaultMessage());
            }
            return sb.toString();
        }else{
            return personScope;
        }
    }
    @RequestMapping(value = "testPersonalValidtor02.do")
    public Object testPersonalValidtor01(@Valid PersonScope personScope, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "error";
        }else{
            return "home";
        }
    }

    @RequestMapping(value = "testDataBinding.do")
    @ResponseBody
    public String testDataBinding(PersonScope personScope){

        return "日期格式转换成功!";
    }
}
