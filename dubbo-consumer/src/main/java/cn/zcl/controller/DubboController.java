package cn.zcl.controller;

import cn.zcl.service.DubboService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  实现服务消费者
 * @Author Administrator
 * @ClassName DubboController
 * @Date 2019/10/6 9:00
 * @Version 1.0
 **/
@RestController
public class DubboController {
    @Reference
    private DubboService dubboService;
    @RequestMapping("/hello")
    public String hello(){
        String h = dubboService.helloDubbo("DUBBO!");
        System.out.println(dubboService.helloDubbo("分布式服务链接成功！"));

        return h;
    }
}
