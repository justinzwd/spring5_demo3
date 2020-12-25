package com.atguigu.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao
{
    @Override
    public void add()
    {
        System.out.println("dao add...");
    }
}
