package com.rs.module.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserControllerImpl implements UserController {
    @Override
    public Object sayHello() {
        return Map.of("message","hello");
    }
}
