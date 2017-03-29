package com.zkn.learnspringmvc.news.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(value ="testJson",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String testJson(@RequestBody Map name, HttpServletRequest request){
        System.out.println(name);
        return "jsonp";
    }
}
