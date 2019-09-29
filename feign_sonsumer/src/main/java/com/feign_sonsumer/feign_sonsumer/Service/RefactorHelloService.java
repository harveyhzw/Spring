package com.feign_sonsumer.feign_sonsumer.Service;

import com.feign_sonsumer.feign_sonsumer.FeignFallback.HelloServiceFallback;
import com.harvey.helloserviceapi.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "HELLO-SERVICE2"/*fallback = HelloServiceFallback.class*/)
public interface RefactorHelloService extends HelloService {

}
