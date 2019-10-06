package cn.zcl;

import cn.zcl.service.DubboService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 *  实现服务提供者
 *  实现服务接口  注意@Service 注解使用的时 Dubbo 提供的而不是 Spring 提供的否则Controller远程调用时获取不到注册的服务
 * @Author Administrator
 * @ClassName DubboServiceImpl
 * @Date 2019/10/6 8:48
 * @Version 1.0
 **/
@Component
@Service //注意@Service 注解使用的时 Dubbo 提供的而不是 Spring 提供的
public class DubboServiceImpl implements DubboService {
    @Override
    public String helloDubbo(String name) {
        return "Hello " + name;
    }
}
