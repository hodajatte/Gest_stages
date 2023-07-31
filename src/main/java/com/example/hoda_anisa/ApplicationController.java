package com.example.hoda_anisa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/login")
    public String home(){
        return "login";
    }


    @GetMapping("/_layout")
    public String Layout(){
        return "_layout";
    }


}
