package me.alex4386.gachon.sw14462.day11.ex6_2b;

public class Time {
    private int hours;
    private int minute;

    public Time() {
        this(0,0);
    }

    public Time(int hours, int minute) {
        if (Time.isValid(hours, minute)) {
            this.hours = hours;
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid time");
        }
    }

    public Time(int hours, int minute, boolean isPM) throws IllegalArgumentException {
        this(hours + (isPM ? 12 : 0), minute);
    }

    public static boolean isValid(int hours, int minute) {
        return (hours >= 0 && hours <= 23) &&
                (minute >= 0 && minute <= 59);
    }

    public String getTime24() {
        return String.format("%02d%02d", this.hours, this.minute);
    }

    public String getTime12() {
        return String.format("%d:%02d %s", this.hours % 12, this.minute, this.hours >= 12 ? "PM" : "AM");
    }

    public void setTime(int hours, int minute) {
        if (Time.isValid(hours, minute)) {
            this.hours = hours;
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid time");
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
