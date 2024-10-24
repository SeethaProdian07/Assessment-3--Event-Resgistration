package com.project.event.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.event.entity.Event;
import com.project.event.repo.EventRepo;
import com.project.event.repo.UserRepo;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepo eventRepo;

    @Autowired
    private UserRepo userRepo;

    @Override
    public Event addEvent(Event event) {
        return eventRepo.save(event);
    }

    @Override
    public List<Event> getDetails() {
       return eventRepo.findAll();
    }

    // @Override
    // public Event addDetails( Event event) {
    //    Optional<Event> eventRepo =  eventRepo.get();
    // }

}
