package me.alex4386.gachon.sw14462.day11.ex6_7;

public class TemperatureTest {
    public static void main(String[] args) {
        Temperature temp0C = new Temperature();
        Temperature temp32F = new Temperature('F', 32);
        System.out.println("Temperature temp0C = new Temperature()");
        System.out.println("Temperature temp32F = new Temperature('F', 32)");

        Temperature tempNeg40C = new Temperature( -40);
        Temperature tempNeg40F = new Temperature('F', -40);
        System.out.println("Temperature tempNeg40C = new Temperature(-40)");
        System.out.println("Temperature tempNeg40F = new Temperature('F', -40)");

        Temperature temp100C = new Temperature('C', 100);
        Temperature temp212F = new Temperature('F', 212);
        System.out.println("Temperature temp100C = new Temperature('C', 100)");
        System.out.println("Temperature temp212F = new Temperature('F', 212)");

        System.out.println("temp0C.equals(temp32F) = "+temp0C.equals(temp32F));
        System.out.println("temp0C.equals(tempNeg40C) = "+temp0C.equals(tempNeg40F));

        Temperature testTemp = new Temperature('C', 100);
        System.out.println("Temperature testTemp = new Temperature('C', 100)");

        System.out.println("testTemp.getCelsius() = " + testTemp.getCelsius());
        System.out.println("testTemp.getFahrenheit() = "+testTemp.getFahrenheit());
        System.out.println("testTemp.setUnit('F')");
        testTemp.setUnit('F');
        System.out.println("testTemp.getCelsius() = " + testTemp.getCelsius());
        System.out.println("testTemp.getFahrenheit() = "+testTemp.getFahrenheit());
        System.out.println("testTemp.setDegree(212)");
        testTemp.setDegree(212);
        System.out.println("testTemp.getCelsius() = " + testTemp.getCelsius());
        System.out.println("testTemp.getFahrenheit() = "+testTemp.getFahrenheit());

        System.out.println("testTemp.setTemperature('C', -100)");
        testTemp.setTemperature('C', -100);
        System.out.println("testTemp.getCelsius() = " + testTemp.getCelsius());
        System.out.println("testTemp.getFahrenheit() = "+testTemp.getFahrenheit());

        System.out.println("testTemp.compareTo(temp100C) = "+testTemp.compareTo(temp100C));
        System.out.println("temp100C.compareTo(testTemp) = "+temp100C.compareTo(testTemp));

        System.out.println("temp100C.isHotter(testTemp) = "+temp100C.isHotter(testTemp));
        System.out.println("testTemp.isHotter(temp100C) = "+testTemp.isHotter(temp100C));

        System.out.println("tempNeg40C.isCooler(temp212F) = "+tempNeg40C.isCooler(temp212F));
        System.out.println("temp0C.isCooler(testTemp) = "+temp0C.isCooler(testTemp));

        System.out.println("End of Test");
    }
}
