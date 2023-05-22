package com.example.jenkinstut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @GetMapping("/getFirstName")
    public String getFirstName() {
        return "Display the First Name";
    }
    
    @GetMapping("/getLastName")
    public String getLastName() {
        return "Display the Last Name";
    }

    @GetMapping("/getEmail")
    public String getEmail() {
        return "Display the Email";
    }

}
