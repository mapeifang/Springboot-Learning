package com.example.demo_1214;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello world!";
    }
    @RequestMapping("/save")
    public void save_data(){

    }
}


