package me.alex4386.gachon.sw14462.day10.ex6_1a;

public class Time {
    private int hours;
    private int minute;

    public Time() {
        this.hours = 0;
        this.minute = 0;
    }

    public static boolean isValid(int hours, int minute) {
        return (hours >= 0 && hours <= 23) &&
                (minute >= 0 && minute <= 59);
    }

    public void setTime(int hours, int minute) {
        if (Time.isValid(hours, minute)) {
            this.hours = hours;
            this.minute = minute;
        }
    }

    public void setTime2(int hours, int minute, boolean isPM) {
        // seems not intended when PM=true and hours=12,
        // but it's not mentioned in the requirement
        int hours24 = hours + (isPM ? 12 : 0);
        this.setTime(hours24, minute);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hours, this.minute);
    }
}
