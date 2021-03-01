package com.griesba.consul100.helloservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final UserServiceClient userServiceClient;

    String sayHello() {
        User user = userServiceClient.getUser();

        return "Hello " + user.getName() + " " + user.getSurname();
    }
}
