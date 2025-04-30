package com.chelsi.cms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        Syst2em.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Nationality: ");
        String nationality = scanner.nextLine();

        System.out.print("Enter Blood Group: ");
        String bloodGroup = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNo = scanner.nextLine();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();


        Course javaCourse = new Course("CSE101", "Java Programming", 4, "Dr. Sharma", "Mon-Wed 10AM");


        Student student = new Student(id, name, email, phone, address, dob, gender, nationality, bloodGroup, rollNo, year);


        System.out.println("\n--- Student Details ---");
        student.getDetails();

        System.out.println("\n--- Enrolling in Course ---");
        student.enrollCourse(javaCourse);
        javaCourse.showDetails();

        System.out.println("\n--- Club Activity ---");
        Club codingClub = new Club("Coding Club", "Alice");
        codingClub.addMember(student.getName());
        codingClub.conductEvent("Hackathon");

        System.out.println("\n--- Event Participation ---");
        Events techFest = new Events("TechFest 2025", "2025-09-15", "Auditorium", "Annual tech event");
        techFest.addParticipant(student.getName());
        techFest.showDetails();

        System.out.println("\n--- Fees Management ---");
        Fees fee = new Fees(50000, 20000, 0, 10000);
        fee.payTuitionFees();
        fee.payHostelFees();
        fee.applyScholarship(15000);
        fee.calculateTotalFees();

        System.out.println("\n--- Hostel Management ---");
        Hostel hostel = new Hostel("H101", "R23", "Mr. Rao", 20000, 2);
        hostel.allocateRoom(student.getName());
        hostel.payHostelFees(student.getName());
        hostel.viewHostelRules();

        System.out.println("\n--- Library System ---");
        Library library = new Library("L1", 1000, 10);
        library.borrowBook("Effective Java");
        library.returnBook("Effective Java", 3);

        scanner.close();
    }
}