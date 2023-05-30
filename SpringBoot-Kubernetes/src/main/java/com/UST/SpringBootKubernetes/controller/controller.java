package com.UST.SpringBootKubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
    @GetMapping("/welcome")
    public String Message(){
        return "Hi Devika";
    }
}
