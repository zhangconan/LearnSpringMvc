package com.zkn.learnspringmvc.news.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.zkn.learnspringmvc.domain.UserScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zkn on 2016/12/31.
 */
@Controller
public class DynamicLoadingPageController {

    @RequestMapping("/get_dynamic_load_page.do")
    public ModelAndView getDynamicLoadPage(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("titleName","动态加载页面");
        modelAndView.setViewName("dynamicLoadPage");
        return modelAndView;
    }

    @RequestMapping("/get_dynamic_load_page_data.do")
    @ResponseBody
    public List<UserScope> getDynamicLoadPageData(){

        List<UserScope> list = new ArrayList<UserScope>();
        list.add(new UserScope("张三","海淀区","coder",20,"tester"));
        list.add(new UserScope("李四","天通苑","manager",25,"developer"));
        list.add(new UserScope("王五","昌平区","coder",21,"qualitier"));
        list.add(new UserScope("马六","立水桥","manager",27,"product"));
        list.add(new UserScope("朱八","三元桥","coder",22,"design"));
        return list;
    }
}
