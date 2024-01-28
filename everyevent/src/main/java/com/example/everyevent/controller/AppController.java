package com.example.everyevent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping (path = "/")
    public String table(){
        return "table";
    }

    @GetMapping (path = "/triathlon")
    public String triathlon(){
        return "triathlon";
    }

    @GetMapping (path = "/running")
    public String running(){
        return "running";
    }
}