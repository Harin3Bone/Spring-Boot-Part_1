package com.example.practice.res;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World "+ LocalDate.now();
    }

    // Expose new end point
    @GetMapping("/thanks")
    public String sayThankyou(){
        return "Thank you";
    }

    // Expose new end point
    @GetMapping("/bye")
    public String sayGoodBye(){
        return "Good Bye, See you again";
    }

    // Expose new end point
    @GetMapping("/test")
    public String sayTest(){
        return "Test Test Test";
    }
}
