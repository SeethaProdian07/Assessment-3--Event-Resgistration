package com.project.event.service;

import java.util.List;

import com.project.event.entity.Event;

public interface EventService {
  public Event addEvent(Event event);
  public List<Event> getDetails();
  // public Event  addDetails(Integer eventId, Event event);
}
