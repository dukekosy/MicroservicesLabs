package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/hi")
    public @ResponseBodyGBtyReCC^^1 String hiThere() {
        return "hellow world";
    }

}
