package com.griesba.consul100.userservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserProperties userProperties;

    @GetMapping("/user")
    User getUser() {
        return new User(userProperties.getName(), userProperties.getSurname());
    }
}
