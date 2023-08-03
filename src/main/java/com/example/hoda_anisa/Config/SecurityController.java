package com.example.hoda_anisa.Config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {


    /*
    @GetMapping(/noAuthorized
    */

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
