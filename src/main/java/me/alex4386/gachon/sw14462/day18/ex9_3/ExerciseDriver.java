package me.alex4386.gachon.sw14462.day18.ex9_3;

public class ExerciseDriver {
    public static void main() {
        System.out.println("Testing patient");

        System.out.println("Creating a patient named 'Sans Undertale' with random filled id num");
        Patient patient = new Patient("Sans Undertale");

        System.out.println("Creating a patient named 'Papyrus Undertale' with provided id num");
        Patient patient2 = new Patient("Papyrus Undertale", "1234567890");

        System.out.println("Testing patient methods");
        System.out.println("Patient 1 name: " + patient.getName());
        System.out.println("Patient 1 id: " + patient.getIdentificationNumber());
        System.out.println("Patient 2 name: " + patient2.getName());
        System.out.println("Patient 2 id: " + patient2.getIdentificationNumber());
        System.out.println("Patient 1.toString(): " + patient.toString());
        System.out.println("Patient 2.toString(): " + patient2.toString());

        System.out.println("Patient 1.equals(Patient 2):" + patient.equals(patient2));

        System.out.println("Testing Doctor");
        System.out.println("Creating a doctor named 'Dr. Mario' with random filled id num and speciality MEDICINE, with visitFee 10000");
        Doctor doctor = new Doctor("Dr. Mario", DoctorSpeciality.MEDICINE, 10000);

        System.out.println("Creating a doctor named 'Dr. Luigi' with random filled id num and speciality SURGERY, with visitFee 20000");
        Doctor doctor2 = new Doctor("Dr. Luigi", DoctorSpeciality.SURGERY, 20000);

        System.out.println("Testing doctor methods");
        System.out.println("Doctor1 name: " + doctor.getName());
        System.out.println("Doctor1 specialty: " + doctor.getSpeciality());
        System.out.println("Doctor1 visit fee: " + doctor.getVisitFee());
        System.out.println("Doctor1.toString(): " + doctor.toString());

        System.out.println("Doctor2 name: " + doctor2.getName());
        System.out.println("Doctor2 specialty: " + doctor2.getSpeciality());
        System.out.println("Doctor2 visit fee: " + doctor2.getVisitFee());
        System.out.println("Doctor2.toString(): " + doctor2.toString());

        System.out.println("Testing Billing");
        System.out.println("Creating a billing with patient 1 and doctor");
        Billing billing1 = new Billing(patient, doctor);

        System.out.println("Patient 1 visiting doctor 3 times");
        for (int i = 0; i < 3; i++) {
            billing1.visit();
        }

        System.out.println("Patient 1 visit count: " + billing1.getVisitCount());
        System.out.println("Doctor 1's income for Patient 1: " + billing1.getIncome());

        System.out.println("Creating a billing with patient 2 and doctor 2");
        Billing billing2 = new Billing(patient2, doctor2);

        System.out.println("Patient 2 visiting doctor 2 5 times");
        for (int i = 0; i < 5; i++) {
            billing2.visit();
        }

        System.out.println("Patient 2 visit count: " + billing2.getVisitCount());
        System.out.println("Doctor 2's income for Patient 2: " + billing2.getIncome());

    }
}
