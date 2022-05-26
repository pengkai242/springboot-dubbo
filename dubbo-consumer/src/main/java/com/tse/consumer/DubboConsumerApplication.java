package com.tse.consumer;
import com.tse.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bruceppeng
 * @describe consumer
 */

@SpringBootApplication
@RestController
public class DubboConsumerApplication {

    @DubboReference(version = "1.0.0",
            application = "${dubbo.application.id}")
    private HelloService helloService;

    @RequestMapping("/sayHello/{name}")
    public @ResponseBody
    String sayHello(@PathVariable String name) {
        return helloService.sayHello(name);
    }


    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

}
