package cn.edu.chd.common.service;

import cn.edu.chd.common.entity.User;

import java.util.List;

public interface HelloService{
    void sayHello(List<Object[]> l);
    void sayHello2(User user);
}
