package com.chelsi.cms;

class Alumni extends Person {
    private int graduationYear;
    private String degreeEarned, currentJob, companyName;
    private double donationAmount;

    public Alumni(String id, String name, String email, String phone, String address, String dateOfBirth,
                  String gender, String nationality, String bloodGroup,
                  int graduationYear, String degreeEarned, String currentJob, String companyName) {
        super(id, name, email, phone, address, dateOfBirth, gender, nationality, bloodGroup);
        this.graduationYear = graduationYear;
        this.degreeEarned = degreeEarned;
        this.currentJob = currentJob;
        this.companyName = companyName;
        this.donationAmount = 0.0;
    }

    public void shareExperience() {
        System.out.println(name + " shares their journey as a " + degreeEarned + " graduate working at " + companyName + ".");
    }

    public void donateToCollege(double amount) {
        donationAmount += amount;
        System.out.println(name + " donated Rs." + amount + " to the college.");
    }

    public void mentorStudent(String studentName) {
        System.out.println(name + " is mentoring student: " + studentName);
    }

    public void attendReunion() {
        System.out.println(name + " is attending the alumni reunion.");
    }
}