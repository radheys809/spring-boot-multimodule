package com.rs.module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
@RestController
public interface UserController {

    @GetMapping("/say-hello")
    public Object sayHello();
}



