package com.example.jenkinstut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @GetMapping("/one")
    public String helloWorld() {
        return "One Initiated";
    }

    @GetMapping("/two")
    public String helloTwo() {
        return "Two Initiated";
    }

}
