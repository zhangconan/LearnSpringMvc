package com.zkn.learnspringmvc.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zkn on 2016/12/3.
 */
@Controller
public class JsonpTestController {

    @RequestMapping("testJsonp")
    public String testJsonp(){

        return "jsonp";
    }
}
