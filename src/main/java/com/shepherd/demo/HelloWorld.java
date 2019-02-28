package com.shepherd.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/2/28.
 */
@RestController
@RequestMapping("")
public class HelloWorld {
    @GetMapping
    public String hello () {
        return "<h1>Hello SpringBoot!</h1>";
    }
}
