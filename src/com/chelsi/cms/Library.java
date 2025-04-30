package com.chelsi.cms;

class Library {
    private String libraryId;
    private double finePerDay;
    private int maxBooksAllowed;

    public Library(String libraryId, double finePerDay, int maxBooksAllowed) {
        this.libraryId = libraryId;
        this.finePerDay = finePerDay;
        this.maxBooksAllowed = maxBooksAllowed;
    }

    public void borrowBook(String bookName) {
        System.out.println("Book borrowed: " + bookName);
    }

    public void returnBook(String bookName, int lateDays) {
        double fine = finePerDay * lateDays;
        System.out.println("Book returned: " + bookName + ", Late Fees: Rs." + fine);
    }
}