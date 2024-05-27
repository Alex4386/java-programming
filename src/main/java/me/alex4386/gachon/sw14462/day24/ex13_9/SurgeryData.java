package me.alex4386.gachon.sw14462.day24.ex13_9;

public class SurgeryData {
    private int age;
    private int year;
    private int nodes;
    private int survival;

    public SurgeryData(int age, int year, int nodes, int survival) {
        this.age = age;
        this.year = year;
        this.nodes = nodes;
        this.survival = survival;
    }

    public static SurgeryData fromCSV(String csv) {
        String[] data = csv.split(",");
        return new SurgeryData(
            Integer.parseInt(data[0]),
            Integer.parseInt(data[1]),
            Integer.parseInt(data[2]),
            Integer.parseInt(data[3])
        );
    }

    public int getAge() {
        return age;
    }

    public int getYear() {
        return year;
    }

    public int getNodes() {
        return nodes;
    }

    public int getSurvival() {
        return survival;
    }
}
