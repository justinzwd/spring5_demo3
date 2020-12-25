package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserService
{
    //@Autowired
    //@Qualifier(value = "userDaoImpl1") //不需要添加set方法
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    @Value(value = "abchhhhh")
    private String name;

    public void add()
    {
        System.out.println("service add...." + name);
        userDao.add();
    }
}
