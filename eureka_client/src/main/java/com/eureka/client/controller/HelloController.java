package com.eureka.client.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.transport.jersey.Jersey1DiscoveryClientOptionalArgs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   /* @Autowired
    private DiscoveryClient client;*/

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello service work";
    }
}
