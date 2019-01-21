/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vasu.SpringJdbcAuthentication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author rv
 */
@Controller
public class MyController {

    @GetMapping("/")
    public String home() {
        System.out.println("/ call");
        return "home";
    }

    @GetMapping("/home")
    public String home1() {
        System.out.println("home call");
        return "home";
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello call");
        return "hello";
    }

    @GetMapping("/403")
    public String hello_1() {
        System.out.println("403 call");
        return "403";
    }

    @GetMapping("/login")
    public String login() {
        System.out.println("Login Controller Call");
        return "login";
    }
}
