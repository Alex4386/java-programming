package me.alex4386.gachon.sw14462.day24.ex13_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream stream;
        File file = new File("haberman.csv");
        try {
            stream = new FileInputStream(file);
        } catch (IOException e) {
            System.err.println("Failed to load following file: haberman.csv");
            System.err.println("Fallback to jar file...");

            stream = Main.class.getResourceAsStream("/day24/ex13_9/haberman.csv");
            if (stream == null) {
                System.err.println("Failed to load following resource from jar file: haberman.csv");
                return;
            }
        }

        Scanner scanner = new Scanner(stream);
        List<SurgeryData> data = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String csv = scanner.nextLine();
            SurgeryData surgeryData = SurgeryData.fromCSV(csv);
            if (surgeryData != null) {
                data.add(surgeryData);
            }
        }

        // calculates the average number of positive axillary nodes detected for
        // patients who survived 5 years or longer
        int totalNodes = 0;
        int totalPatients = 0;
        for (SurgeryData surgeryData : data) {
            if (surgeryData.getSurvival() == 1) {
                totalNodes += surgeryData.getNodes();
                totalPatients++;
            }
        }

        System.out.println("Average number of positive axillary nodes detected for patients who survived 5 years or longer: " + (totalNodes / totalPatients));

        // the average number of positive axillary nodes detected for patients who died within 5 years
        totalNodes = 0;
        totalPatients = 0;
        for (SurgeryData surgeryData : data) {
            if (surgeryData.getSurvival() == 2) {
                totalNodes += surgeryData.getNodes();
                totalPatients++;
            }
        }

        System.out.println("Average number of positive axillary nodes detected for patients who died within 5 years: " + (totalNodes / totalPatients));
    }
}
