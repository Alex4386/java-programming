package me.alex4386.gachon.sw14462.day21.ex11_1b;

public class Main {
    public static void main(String[] args) {
        String[] timeArray = new String[]{
                "12:34 am",
                "12:34 pm",
                "17:34 pm", // invalid case
                "12:60 pm", // invalid case
                "12:34" // invalid case
        };

        for (String time : timeArray) {
            try {
                if(checkTime(time)) {
                    System.out.println(time + " is valid");
                }
            } catch (InvalidTimeException e) {
                System.out.println(time + " is invalid");
            }
        }

        System.out.println();
        System.out.println("====== TESTING HOURS ======");

        String[] hourArray = new String[]{
                "12",
                "22",
                "25" // invalid case
        };

        for (String hour : hourArray) {
            try {
                if(checkHour(hour)) {
                    System.out.println(hour + " is valid");
                }
            } catch (InvalidHourException e) {
                System.out.println(hour + " is invalid");
            }
        }
        System.out.println();
        System.out.println("===== TESTING MINUTES =====");

        String[] minuteArray = new String[]{
                "34",
                "59",
                "60" // invalid case
        };

        for (String minute : minuteArray) {
            try {
                if(checkMinute(minute)) {
                    System.out.println(minute + " is valid");
                }
            } catch (InvalidMinuteException e) {
                System.out.println(minute + " is invalid");
            }
        }

    }

    public static boolean checkTime(String time) throws InvalidTimeException {
        // check the time is in format of /^[0-9]{2}:[0-9]{2} (am|pm)$/ig
        if(time.matches("^(0[0-9]|1[0-2]):([0-5][0-9]) (am|pm)$")) return true;
        throw new InvalidTimeException();
    }

    public static boolean checkHour(String hours) throws InvalidHourException {
        if (hours.matches("^(0[0-9]|1[0-9]|2[0-3])$")) return true;
        throw new InvalidHourException();
    }

    public static boolean checkMinute(String minutes) throws InvalidMinuteException {
        if (minutes.matches("^([0-5][0-9])$")) return true;
        throw new InvalidMinuteException();
    }
}
