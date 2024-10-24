package com.project.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.event.entity.Event;
import com.project.event.service.EventService;

@RestController
@RequestMapping("/event")
@CrossOrigin("*")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/addEvent")
    public Event addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

    @GetMapping("/getDetails")
    public List<Event> getDetails() {
        return eventService.getDetails();
    }

}
