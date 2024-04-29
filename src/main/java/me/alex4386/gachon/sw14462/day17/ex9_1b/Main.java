package me.alex4386.gachon.sw14462.day17.ex9_1b;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Doctor 1 ===");
        Doctor d1 = new Doctor();
        d1.setName("Dr. John Doe");
        d1.setSpeciality(DoctorSpeciality.MEDICINE);
        d1.setVisitFee(10000);
        System.out.println(d1);

        System.out.println("=== Doctor 2 ===");
        Doctor d2 = new Doctor();
        d2.setName("Dr. Jane Smith");
        d2.setSpeciality(DoctorSpeciality.SURGERY);
        d2.setVisitFee(15000);
        System.out.println(d2);

        System.out.println("=== Doctor 3 ===");
        Doctor d3 = new Doctor();
        d3.setName("Dr. John Doe");
        d3.setSpeciality(DoctorSpeciality.MEDICINE);
        d3.setVisitFee(10000);
        System.out.println(d3);


        System.out.println("=== Compare Doctor 1 & Doctor 2 ===");
        System.out.println("Expected Result: Different");
        if (d1.equals(d2)) {
            System.out.println("Doctor 1 and Doctor 2 are the same.");
        } else {
            System.out.println("Doctor 1 and Doctor 2 are different.");
        }

        System.out.println("=== Compare Doctor 1 & Doctor 3 ===");
        System.out.println("Expected Result: Same");
        if (d1.equals(d3)) {
            System.out.println("Doctor 1 and Doctor 3 are the same.");
        } else {
            System.out.println("Doctor 1 and Doctor 3 are different.");
        }


    }
}
