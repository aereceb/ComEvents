package com.example.EventHub.Event;

import com.example.EventHub.EventStatus.EventStatus;
import com.example.EventHub.EventType.EventType;
import com.example.EventHub.Organisation.Organisation;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class EventDTO {
        @NotEmpty(message = "The name of the event can not be empty!")
        private String name;
        private Date date;
        @NotNull(message = "Please enter the duration of the event!")
        private int duration;
        @NotEmpty(message = "Please enter description!")
        private String description;
        @NotEmpty(message = "Please enter the place of the event!")
        private String place;
        @NotNull(message = "Please enter the price of the ticket for the event!")
        private int ticketPrice;
        @NotNull(message = "Please enter the capacity of the event!")
        private int capacity;
        private Organisation organisation;
        private EventType eventType;
        private EventStatus eventStatus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        public int getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public Organisation getOrganisation() {
            return organisation;
        }

        public void setOrganisation(Organisation organisation) {
            this.organisation = organisation;
        }

        public EventType getEventType() {
            return eventType;
        }

        public void setEventType(EventType eventType) {
            this.eventType = eventType;
        }

        public EventStatus getEventStatus() {
            return eventStatus;
        }

        public void setEventStatus(EventStatus eventStatus) {
            this.eventStatus = eventStatus;
        }
    }
