package com.eventease.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import java.time.OffsetDateTime;

@Entity
public class Event {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank private String title;
    private OffsetDateTime startsAt;
    private String venue;
    @Min(1) private int capacity;

    protected Event() {}
    public Event(String title, OffsetDateTime startsAt, String venue, int capacity) { this.title = title; this.startsAt = startsAt; this.venue = venue; this.capacity = capacity; }
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public OffsetDateTime getStartsAt() { return startsAt; }
    public String getVenue() { return venue; }
    public int getCapacity() { return capacity; }
}
