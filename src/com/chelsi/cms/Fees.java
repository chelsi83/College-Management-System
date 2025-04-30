package com.chelsi.cms;

class Fees {
    private double tuitionFee, hostelFee, libraryFee, examFee;
    private double scholarship;

    public Fees(double tuitionFee, double hostelFee, double libraryFee, double examFee) {
        this.tuitionFee = tuitionFee;
        this.hostelFee = hostelFee;
        this.libraryFee = libraryFee;
        this.examFee = examFee;
        this.scholarship = 0;
    }

    public void payTuitionFees() {
        System.out.println("Tuition fees paid: Rs." + tuitionFee);
    }

    public void payHostelFees() {
        System.out.println("Hostel fees paid: Rs." + hostelFee);
    }

    public void applyScholarship(double amount) {
        scholarship = amount;
        System.out.println("Scholarship of Rs." + amount + " applied.");
    }

    public void calculateTotalFees() {
        double total = tuitionFee + hostelFee + libraryFee + examFee - scholarship;
        System.out.println("Total Fees Payable: Rs." + total);
    }
}
