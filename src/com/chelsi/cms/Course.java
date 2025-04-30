package com.chelsi.cms;

public class Course {
    private String courseId, courseName, facultyInCharge, schedule;
    private int credits;

    public Course(String courseId, String courseName, int credits, String facultyInCharge, String schedule) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.facultyInCharge = facultyInCharge;
        this.schedule = schedule;
    }

    public String getCourseName() {
        return courseName;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName + ", Faculty: " + facultyInCharge);
    }
}

