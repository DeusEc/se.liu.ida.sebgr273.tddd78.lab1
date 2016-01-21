package se.liu.ida.sebgr273.tddd78.lab2;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class Calendar {
    private ArrayList<Appointment> appointments;

    public Calendar() {
        appointments = new ArrayList<>();
    }

    public void show(){
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    public void book(int year, String month, int day,
                     String start, String end, String subject) {
        String[] strt = start.split(":");
        String[] nd = end.split(":");
        int strtHr = Integer.parseInt(strt[0]);
        int strtMn = Integer.parseInt(strt[1]);
        int ndHr = Integer.parseInt(nd[0]);
        int ndMn = Integer.parseInt(nd[1]);

        if(year < 2013) {
            throw new IllegalArgumentException("Invalid year!");
        } else if(Month.getMonthDays(month) < day
                || Month.getMonthNumber(month) == -1){
            throw new IllegalArgumentException("Invalid day");
        } else if(Month.getMonthNumber(month) == -1){
            throw new IllegalArgumentException("Invalid month");
        } else if(strtHr > 23 || strtHr < 0  || strtMn > 59 || strtMn < 0){
            throw new IllegalArgumentException("Invalid start time");
        } else if(ndHr > 23 || ndHr < 0  || ndMn > 59 || ndMn < 0){
            throw new IllegalArgumentException("Invalid end time");
        } else {

        }
        Month month1 = new Month(month,
                            Month.getMonthNumber(month),
                            Month.getMonthDays(month));
        Date date = new Date(year, month1, day);
        TimePoint srt = new TimePoint(start);
        TimePoint ind = new TimePoint(end);
        TimeSpan timeSpan = new TimeSpan(srt, ind);

        Appointment appointment = new Appointment(subject,
                date, timeSpan);

        Calendar.this.appointments.add(appointment);
    }
}
