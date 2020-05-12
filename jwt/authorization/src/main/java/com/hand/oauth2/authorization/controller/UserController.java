package com.hand.oauth2.authorization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello security";
    }

    @GetMapping("/admin/hello")
    public String admin() {
        return "hello admin";
    }

    @GetMapping("/dba/hello")
    public String dba() {
        return "hello dba";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "hello user";
    }
}