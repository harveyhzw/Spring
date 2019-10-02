package com.feign_sonsumer.feign_sonsumer.Controller;

import com.feign_sonsumer.feign_sonsumer.Service.HelloService;
import com.feign_sonsumer.feign_sonsumer.Service.RefactorHelloService;
import com.harvey.helloserviceapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @Autowired
    HelloService helloService;

    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value="/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("Harvey")).append("\n");
        sb.append(refactorHelloService.hello("Harvey", 18)).append("\n");
        sb.append(refactorHelloService.hello(new User("Harvey", 18))).append("\n");
        return sb.toString();
    }

}

