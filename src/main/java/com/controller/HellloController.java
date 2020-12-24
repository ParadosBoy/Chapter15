package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 10574
 */
@Controller
public class HellloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("helle!");
        return "success";
    }
}
