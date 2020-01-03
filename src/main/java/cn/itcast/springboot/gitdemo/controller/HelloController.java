package cn.itcast.springboot.gitdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/info")
    public String hello(){
        return "this a git demo yo";
    }
}
