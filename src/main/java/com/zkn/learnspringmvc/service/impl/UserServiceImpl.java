package com.zkn.learnspringmvc.service.impl;

import com.zkn.learnspringmvc.dao.UserDAO;
import com.zkn.learnspringmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2016/9/7.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDao;


}
