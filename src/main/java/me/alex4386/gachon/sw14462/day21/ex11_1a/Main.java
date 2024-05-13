package me.alex4386.gachon.sw14462.day21.ex11_1a;

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
    }

    public static boolean checkTime(String time) throws InvalidTimeException {
        // check the time is in format of /^[0-9]{2}:[0-9]{2} (am|pm)$/ig
        if(time.matches("^(0[0-9]|1[0-2]):([0-5][0-9]) (am|pm)$")) return true;
        throw new InvalidTimeException();
    }
}
