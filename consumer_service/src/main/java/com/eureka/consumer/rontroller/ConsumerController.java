package com.eureka.consumer.rontroller;

import com.eureka.consumer.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/ribbon-consumer")
    public String helloConsumer() {
        return helloService.helloConsumer();
    }
}
