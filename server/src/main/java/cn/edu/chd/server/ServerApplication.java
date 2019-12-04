package cn.edu.chd.server;

import cn.edu.chd.common.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiServiceExporter;

import java.rmi.RemoteException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServerApplication {
    @Autowired
    private HelloService helloService;

    @Bean
    public RmiServiceExporter rmiServiceExporter(){
        RmiServiceExporter rse = new RmiServiceExporter();
        rse.setServiceName("helloService");
        rse.setService(helloService);
        rse.setServiceInterface(HelloService.class);
        rse.setRegistryPort(1099);
        try{
            rse.afterPropertiesSet();
            System.out.println("连接成功");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return rse;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
