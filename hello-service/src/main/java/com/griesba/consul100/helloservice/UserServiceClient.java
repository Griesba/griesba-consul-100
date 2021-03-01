package com.griesba.consul100.helloservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user-service", url = "http://localhost:8081")
public interface UserServiceClient {

    @RequestMapping("/user")
    User getUser();
}
