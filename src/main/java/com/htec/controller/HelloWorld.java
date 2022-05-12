package com.htec.controller;

import com.htec.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HelloWorld {

    private final HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.getHelloWorld();
    }
}
