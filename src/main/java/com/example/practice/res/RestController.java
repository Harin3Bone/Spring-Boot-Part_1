package com.example.practice.res;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    // Injection for properties
    @Value("${hero.name}")
    private String heroName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Hero : "+heroName+"\nTeam : "+teamName;
    }

    // Request Mapping annotation
    @RequestMapping("/")
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
