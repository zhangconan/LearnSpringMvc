package com.zkn.learnspringmvc.news.controller.user;

import com.zkn.learnspringmvc.domain.UserScope;
import com.zkn.learnspringmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zkn on 2016/9/9.
 */
@Controller
public class AddUserInfoController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUserInfo.do")
    @ResponseBody
    public String addUserInfo(HttpServletRequest request){

        UserScope userScope = new UserScope();
        userScope.setUserName(request.getParameter("user_name"));
        userScope.setPassWord(request.getParameter("pass_word"));
        userScope.setAddress(request.getParameter("address"));

        return "保存成功!!!!";
    }
}
