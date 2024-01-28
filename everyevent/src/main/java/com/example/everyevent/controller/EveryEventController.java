package com.example.everyevent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.everyevent.entity.EveryEvent;
import com.example.everyevent.service.EveryEventService;

import java.util.List;

@RestController
public class EveryEventController {

    private final EveryEventService service;

    public EveryEventController(EveryEventService everyEventService) {
        this.service = everyEventService;
    }

    @GetMapping(path="/data")
    public List<EveryEvent> pullDatabase(){
        return service.findAll();
    }
}
