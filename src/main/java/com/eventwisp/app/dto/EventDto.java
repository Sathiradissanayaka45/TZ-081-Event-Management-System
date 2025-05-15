package com.eventwisp.app.dto;

import com.eventwisp.app.entity.Ticket;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class EventDto {
    private String eventName;
    private LocalDate startingDate;
    private String coverImageLink;
    private String description;
    private Long eventCategoryId;
    private List<Ticket> tickets;
}
