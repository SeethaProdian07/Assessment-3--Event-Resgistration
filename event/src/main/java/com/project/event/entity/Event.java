package com.project.event.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer eventId;
    private String eventName;
    private String eventDate;
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    private List<User> user;
}
