package cn.edu.chd.db_middleware.service.impl;

import cn.edu.chd.db_middleware.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public Object sayHello(){
        System.out.println("hello world");
        return "hello world";
    }
}
