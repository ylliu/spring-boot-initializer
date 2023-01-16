package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is " + new java.util.Date();
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard  100-ksds-for us !";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day s!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "This is the team info";
    }
}
