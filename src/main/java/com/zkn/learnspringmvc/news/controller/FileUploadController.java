package com.zkn.learnspringmvc.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zkn on 2017/2/22.
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    @RequestMapping("/uploadPage.do")
    public String uploadPage(){

        return "uploadPage";
    }
}
