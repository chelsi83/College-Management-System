package com.chelsi.cms;

public class Student extends Person {
    private String rollNo;
    private int yearOfStudy;

    public Student(String id, String name, String email, String phone, String address, String dob, String gender, String nationality, String bloodGroup, String rollNo, int year) {
        super(id, name, email, phone, address, dob, gender, nationality, bloodGroup);
        this.rollNo = rollNo;
        this.yearOfStudy = year;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        System.out.println(name + " enrolled in course: " + course.getCourseName());
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Roll No: " + rollNo + ", Year: " + yearOfStudy);
    }
}
