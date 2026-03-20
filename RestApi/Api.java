package com.t7.RestApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @GetMapping("dis")
    public String disply(){
        return "Hello";
    }
}
