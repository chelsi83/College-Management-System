package com.chelsi.cms;

class Hostel {
    private String hostelName, roomNumber, wardenName;
    private double fees;
    private int capacity;

    public Hostel(String hostelName, String roomNumber, String wardenName, double fees, int capacity) {
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        this.wardenName = wardenName;
        this.fees = fees;
        this.capacity = capacity;
    }

    public void allocateRoom(String studentName) {
        System.out.println("Room " + roomNumber + " allocated in Hostel " + hostelName + " to student: " + studentName);
    }

    public void payHostelFees(String studentName) {
        System.out.println("Hostel fees paid by " + studentName + ": Rs." + fees);
    }

    public void viewHostelRules() {
        System.out.println("Hostel Rules: No noise after 10 PM, maintain cleanliness, adhere to curfew.");
    }
}

