package se.liu.ida.sebgr273.tddd78.lab2;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Appointment> appointments;

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
        String[] startList = start.split(":");
        String[] endList = end.split(":");
        int startHr = Integer.parseInt(startList[0]);
        int startMn = Integer.parseInt(startList[1]);
        int endHr = Integer.parseInt(endList[0]);
        int endMn = Integer.parseInt(endList[1]);

        /*if(year < 2013) {
            throw new IllegalArgumentException("Invalid year!");
        } else*/ if(Month.getMonthDays(month) >= day || day < 0){
            throw new IllegalArgumentException("Invalid day");
        } else if(Month.getMonthNumber(month) == -1){
            throw new IllegalArgumentException("Invalid month");
        } /*else if(startHr > 23 || startHr < 0  || startMn > 59 || startMn < 0){
            throw new IllegalArgumentException("Invalid start time");
        } else if(endHr > 23 || endHr < 0  || endMn > 59 || endMn < 0){
            throw new IllegalArgumentException("Invalid end time");
        }*/ else {
            Month month1 = new Month(month,
                    Month.getMonthNumber(month),
                    Month.getMonthDays(month));
            Date date = new Date(year, month1, day);
            TimePoint srt = new TimePoint(start);
            TimePoint ind = new TimePoint(end);
            TimeSpan timeSpan = new TimeSpan(srt, ind);

            Appointment appointment = new Appointment(subject,
                    date, timeSpan);

            this.appointments.add(appointment);
        }

    }
}
