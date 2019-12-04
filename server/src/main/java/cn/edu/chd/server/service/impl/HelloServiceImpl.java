package cn.edu.chd.server.service.impl;

import cn.edu.chd.common.entity.User;
import org.springframework.stereotype.Service;
import cn.edu.chd.common.service.HelloService;

import java.util.Arrays;
import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(List<Object[]> l) {
        for (Object[] item : l) {
            System.out.println("item = " + Arrays.toString(item));
        }
    }

    @Override
    public void sayHello2(User user) {
        System.out.println("user = " + user);
    }
}
