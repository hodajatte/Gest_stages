package com.example.hoda_anisa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/login")
    public String home(){
        return "login";
    }
    @GetMapping("/index")
    public String Index(){
        return "index";
    }

    @GetMapping("/index2")
    public String Index2(){
        return "index2";
    }


}
