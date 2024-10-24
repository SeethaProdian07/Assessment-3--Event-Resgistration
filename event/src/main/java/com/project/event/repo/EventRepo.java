package com.project.event.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.event.entity.Event;

@Repository
public interface EventRepo extends JpaRepository<Event,Integer>{

}
