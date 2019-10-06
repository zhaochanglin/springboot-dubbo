package cn.zcl;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  启动程序入口
 * @Author Administrator
 * @ClassName DubApplication
 * @Date 2019/10/6 8:44
 * @Version 1.0
 **/

@SpringBootApplication
@EnableDubboConfiguration
public class DubApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubApplication.class,args);
        System.out.println("Dubbo项目服务启动成功！端口：8088");
    }
}
