package cn.edu.chd.client;

import cn.edu.chd.client.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientApplicationTests {
    @Autowired
    private HelloService helloService;

    @Test
    void contextLoads() {
    }

    @Test
    void m1(){
        String result = (String)helloService.sayHello();
        System.out.println(result);
    }
}
