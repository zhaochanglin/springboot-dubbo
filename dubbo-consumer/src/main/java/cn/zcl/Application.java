package cn.zcl;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/** 控制层启动入口
 *  服务消费者启动
 * @Author Administrator
 * @ClassName Application
 * @Date 2019/10/6 8:56
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDubboConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println("消费者项目启动成功！端口：8089");
    }
}
