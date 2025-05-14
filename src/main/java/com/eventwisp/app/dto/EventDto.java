package com.eventwisp.app.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class EventDto {
    private String eventName;
    private LocalDate startingDate;
    private String coverImageLink;
    private String description;
    private Long eventCategoryId;
}
