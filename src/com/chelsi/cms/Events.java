package com.chelsi.cms;

import java.util.ArrayList;

 public class Events {
    private String eventName, date, location, description;
    private ArrayList<String> participants = new ArrayList<>();

    public Events(String eventName, String date, String location, String description) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.description = description;
    }

    public void addParticipant(String name) {
        participants.add(name);
        System.out.println("Participant added to event " + eventName + ": " + name);
    }

    public void showDetails() {
        System.out.println("Event: " + eventName + ", Date: " + date + ", Location: " + location + ", Description: " + description);
    }
}