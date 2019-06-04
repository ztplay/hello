package com.ssm.controller;

import com.ssm.dao.UserMapper;
import com.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("getuser")
    @ResponseBody
    public User getUser(){
        return userMapper.selectByPrimaryKey(12);
    }
}
