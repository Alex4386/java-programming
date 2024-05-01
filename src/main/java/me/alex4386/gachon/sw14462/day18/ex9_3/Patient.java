package me.alex4386.gachon.sw14462.day18.ex9_3;

public class Patient extends Person {
    private String identificationNumber;

    public Patient(String name) {
        // random fill the identification number
        this(name, String.format("%07d", (int) (Math.random() * 1000000)));
    }

    public Patient(String name, String identificationNumber) {
        super(name);
        this.identificationNumber = identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public boolean equals(Patient other) {
        return this.hasSameName(other) && this.identificationNumber.equals(other.getIdentificationNumber());
    }

    @Override
    public String toString() {
        return "Patient - Name: " + getName() + ", ID: " + identificationNumber;
    }
}
