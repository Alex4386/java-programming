package me.alex4386.gachon.sw14462.day21.ex11_3;

public class DateParser {
    public String parseDate(String date) throws MonthException, DayException {
        String[] dateArray = date.split("/");
        if (dateArray.length != 2) {
            throw new MonthException();
        }

        String monthRaw = dateArray[0];
        int month;
        try {
            month = Integer.parseInt(monthRaw);
        } catch(NumberFormatException e) {
            throw new MonthException();
        }

        String dayRaw = dateArray[1];
        int day;
        try {
            day = Integer.parseInt(dayRaw);
        } catch(NumberFormatException e) {
            throw new DayException();
        }

        if (month < 1 || month > 12) {
            throw new MonthException();
        }

        if (day < 1 || day > this.getEndOfMonth(month)) {
            throw new DayException();
        }

        String parsed = this.getMonthString(month) + " " + day;
        return parsed;
    }

    private String getMonthString(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }

    private int getEndOfMonth(int month) {
        switch (month) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}

class MonthException extends Exception {
    public MonthException() {
        this("Invalid Month Range");
    }

    public MonthException(String message) {
        super(message);
    }
}

class DayException extends Exception {
    public DayException() {
        this("Invalid Day Range");
    }

    public DayException(String message) {
        super(message);
    }
}