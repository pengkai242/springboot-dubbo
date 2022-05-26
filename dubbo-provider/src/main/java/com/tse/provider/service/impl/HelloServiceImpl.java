package com.tse.provider.service.impl;
import com.tse.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author gaozhy
 * @describe
 * @date 2020/11/2 8:02 下午
 */
@DubboService(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}"
)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello:"+name;
    }
}
