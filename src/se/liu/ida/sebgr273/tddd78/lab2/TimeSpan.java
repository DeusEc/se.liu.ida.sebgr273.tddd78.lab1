package se.liu.ida.sebgr273.tddd78.lab2;

public class TimeSpan {
    private TimePoint start;
    private TimePoint end;

    public TimePoint getStart() {
        return start;
    }

    public TimePoint getEnd() {
        return end;
    }

    public TimeSpan(TimePoint start, TimePoint end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return start + " - " + end;
    }
}
