package com.griesba.consul100.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    User getUser() {
        return new User("pat", "vill");
    }
}
