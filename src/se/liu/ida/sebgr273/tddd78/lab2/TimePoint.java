package se.liu.ida.sebgr273.tddd78.lab2;

public class TimePoint {
    private String time;
    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public  TimePoint(String time) {
        this.time = time;
        String[] parts = time.split(":");
        this.hour = Integer.parseInt(parts[0]);
        this.minute = Integer.parseInt(parts[1]);
    }

    @Override
    public String toString() {
        return time;
    }
}
