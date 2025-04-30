package com.chelsi.cms;

public class Person {
    protected String id, name, email, phone, address, dateOfBirth, gender, nationality, bloodGroup;

    public Person(String id, String name, String email, String phone, String address, String dateOfBirth, String gender, String nationality, String bloodGroup) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.bloodGroup = bloodGroup;
    }

    public void getDetails() {
        System.out.println("Name: " + name + ", Email: " + email);
    }
}

