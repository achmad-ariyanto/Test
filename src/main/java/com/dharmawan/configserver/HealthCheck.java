package com.dharmawan.configserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configserver")
public class HealthCheck {
    @GetMapping("/")
    public String success() {
        return "success";
    }
}
