package com.todo_app.todo_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("ss")
public class TestController {

	@GetMapping("/test")
    public String test() {
		System.out.println("here we started");
        return "Spring Boot is working ";
    }
    
}