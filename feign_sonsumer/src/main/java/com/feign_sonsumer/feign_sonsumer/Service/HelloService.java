package com.feign_sonsumer.feign_sonsumer.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
}
