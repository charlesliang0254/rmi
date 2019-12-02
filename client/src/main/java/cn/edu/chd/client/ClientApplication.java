package cn.edu.chd.client;

import cn.edu.chd.client.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@SpringBootApplication
public class ClientApplication {

    @Bean
    public RmiProxyFactoryBean rmiProxyFactoryBean(){
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://0.0.0.0:1099/helloService");
        rmiProxyFactoryBean.setServiceInterface(HelloService.class);
        return rmiProxyFactoryBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
