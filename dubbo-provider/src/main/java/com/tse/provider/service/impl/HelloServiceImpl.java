package com.tse.provider.service.impl;
import com.tse.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author bruceppeng
 * @describe provider
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
