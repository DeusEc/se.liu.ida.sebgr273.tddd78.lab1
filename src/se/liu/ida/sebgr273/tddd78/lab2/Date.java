package se.liu.ida.sebgr273.tddd78.lab2;

public class Date {
    private int year;
    private Month month;
    private int day;

    public Date(int year, Month month, int day) {
        if (year <= 2013){
            throw new IllegalArgumentException(
                    "You need to enter a year after 2012");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return this.month.getName();
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return getYear() + " / " + getMonth() + " / " + getDay() ;
    }
}
