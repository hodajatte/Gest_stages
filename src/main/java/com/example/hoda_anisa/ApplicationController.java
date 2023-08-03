package com.example.hoda_anisa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
  // @GetMapping("/")
   //public String home(){
    //  return "redirect:/index";
   // }

   @GetMapping("/index")
    public String Index(){
      return "index";
    }
   // @GetMapping("/_layout")
    //public String Layout(){
        //return "_layout";
    //}//


}
