package com.eventwisp.app.entity;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "event")
@Setter
@Getter
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "starting_date")
    private LocalDate startingDate;

    @Column(name = "cover_image_link")
    private String coverImageLink;

    @Column(name = "description")
    private String description;

    //Make sure, that 'isCompleted' is false by default
    @Column(name = "is_completed",nullable = false,columnDefinition = "BOOLEAN DEFAULT FALSE")
    @JsonSetter(nulls = Nulls.SKIP) //skip null values assuring isCompleted would take only 'tru' or 'false'
    private Boolean isCompleted;

    //Create a column for foriegn key
    @ManyToOne
    @JoinColumn(name = "event_category_id")
    private EventCategory eventCategory;
}
