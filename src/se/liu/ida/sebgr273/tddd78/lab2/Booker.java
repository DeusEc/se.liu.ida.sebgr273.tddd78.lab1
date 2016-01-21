package se.liu.ida.sebgr273.tddd78.lab2;

import java.util.Random;

public class Booker {
    public static void main(String[] args) {
        Calendar test = new Calendar();

        test.book(2015, "Januari", 15, "14:00", "15:30", "Eat sandwiches");
        test.book(2015, "Februari", 12, "00:00", "07:00", "Sleep");
        test.book(2015, "Oktober", 30, "04:00", "15:00", "Watch tv");
        test.book(2016, "April", 4, "08:00", "17:00", "Live");

        test.show();
    }
}
