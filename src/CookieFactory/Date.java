package CookieFactory;

/**
 * Simplified class to embodies a date.
 */
public class Date {

    private int day = -1;
    private int month = -1;
    private int year = -2000;
    private int hours = -1;
    private int minutes = -1;

    public Date(int day, int month, int year, int hours, int minutes) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hours = hours;
        this.minutes = minutes;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        String date = "";
        if (day != -1) {
            if (day < 10)
                date += "0" + day + "/";
            else
                date += day + "/";
            if (month < 10)
                date += "0" + month + "/";
            else
                date += month + "/";
            date += Integer.toString(year);
        }
        if (hours != -1) {
            if (day != -1)
                date += " at ";
            if (hours < 10)
                date += "0" + hours + ":";
            else
                date += hours + ":";
            if (minutes < 10)
                date += "0" + minutes;
            else
                date += Integer.toString(minutes);
        }
        return date;
    }

}
