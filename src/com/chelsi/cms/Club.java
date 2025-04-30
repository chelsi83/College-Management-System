package com.chelsi.cms;

import java.util.ArrayList;
import java.util.List;

class Club {
    private String clubName, coordinator;
    private ArrayList<String> members = new ArrayList<>();

    public Club(String clubName, String coordinator) {
        this.clubName = clubName;
        this.coordinator = coordinator;
    }

    public void addMember(String name) {
        members.add(name);
        System.out.println(name + " has joined the club: " + clubName);
    }

    public void conductEvent(String event) {
        System.out.println("Event conducted in club " + clubName + ": " + event);
    }
}