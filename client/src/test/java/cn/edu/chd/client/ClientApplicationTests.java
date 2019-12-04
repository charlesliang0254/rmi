package cn.edu.chd.client;

import cn.edu.chd.common.entity.User;
import cn.edu.chd.common.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ClientApplicationTests {
    @Autowired
    private HelloService helloService;

    @Test
    void contextLoads() {
    }

    @Test
    void m1(){
        Object[] item = {
                "梁佳豪",
                "13571600765/ljh",
                "西安"
        };
        List<Object[]> l = new ArrayList<>();
        l.add(item);
        helloService.sayHello(l);
        User user = new User();
        user.setUsername("梁佳豪");
        user.setPassword("13571600765/ljh");
        user.setAddress("西安");
        helloService.sayHello2(user);
    }
}
