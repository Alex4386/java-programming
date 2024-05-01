package me.alex4386.gachon.sw14462.day18.ex9_3;

public class Billing {
    private Patient patient;
    private Doctor doctor;

    private int visitCount;

    public Billing(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;

        this.visitCount = 0;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void visit() {
        this.visitCount++;
    }

    public int getVisitCount() {
        return this.visitCount;
    }

    public double getIncome() {
        return this.visitCount * this.doctor.getVisitFee();
    }
}
