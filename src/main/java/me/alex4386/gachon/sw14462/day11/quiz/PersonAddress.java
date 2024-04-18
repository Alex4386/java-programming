package me.alex4386.gachon.sw14462.day11.quiz;

public class PersonAddress {

    public static String nationality = "Korea";

    private String firstName;
    private String lastName;
    private String emailAddress;


    private String phoneNumber;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static String getNationality() {
        return PersonAddress.nationality;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printPersonInfo() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Email Address: " + this.emailAddress);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Nationality: " + PersonAddress.nationality);
    }

    public boolean equals(PersonAddress other) {
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    }
}
