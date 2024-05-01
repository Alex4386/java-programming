package me.alex4386.gachon.sw14462.day18.ex9_3;

import me.alex4386.gachon.sw14462.day17.ex9_1b.Person;

public class Doctor extends Person {
    private DoctorSpeciality speciality;
    private double visitFee = 0.0;

    public Doctor() {
        super();
        this.speciality = null;
        this.visitFee = 0.0;
    }

    public Doctor(String initialName, DoctorSpeciality speciality, double visitFee) {
        super(initialName);
        this.speciality = speciality;
        this.visitFee = visitFee;
    }

    public void setSpeciality(DoctorSpeciality speciality) {
        if (speciality == null) {
            throw new IllegalArgumentException("Speciality cannot be null");
        }

        this.speciality = speciality;
    }

    public DoctorSpeciality getSpeciality() {
        return this.speciality;
    }

    public void setVisitFee(double visitFee) {
        if (visitFee < 0) {
            throw new IllegalArgumentException("Visit Fee cannot be negative");
        }

        this.visitFee = visitFee;
    }

    public double getVisitFee() {
        return this.visitFee;
    }

    @Override
    public String toString() {
        return "Doctor: " + this.getName() + ", Speciality: " + this.getSpeciality() + ", Visit Fee: " + this.getVisitFee();
    }

    public boolean equals(Doctor otherDoctor) {
        return this.hasSameName(otherDoctor) && this.getSpeciality() == otherDoctor.getSpeciality() && this.getVisitFee() == otherDoctor.getVisitFee();
    }

}
