package se.liu.ida.sebgr273.tddd78.lab2;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDay;

    public Person(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    private int getAge(){
        LocalDate now = LocalDate.now();
        return Period.between(birthDay, now).getYears();
    }

    public static void main(String[] args) {
        Person Sebastian = new Person("Sebastian", LocalDate.of(1996, 12, 13));
        Person Hampus = new Person("Hampus", LocalDate.of(1337,  3,  1));
        System.out.println(Hampus.toString());
        System.out.println(Sebastian.toString());
    }

    @Override
    public String toString() {
        return name + " " + getAge();
    }
}
