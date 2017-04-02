package com.zkn.learnspringmvc.news.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
    /**
    @RequestMapping(value ="testJson")
    public String testJson(@RequestBody Map name, HttpServletRequest request){
        System.out.println(name);
        return "jsonp";
    }
     */
    @RequestMapping(value ="testJson")
    public String testJson(HttpServletRequest request){
        try {
            InputStream inputStream = request.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int flag = 0;
            while ((flag = inputStream.read(bytes)) > 0){
                byteArrayOutputStream.write(bytes,0,flag);
            }
            System.out.println(new String(byteArrayOutputStream.toByteArray(),request.getCharacterEncoding()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "jsonp";
    }
}
