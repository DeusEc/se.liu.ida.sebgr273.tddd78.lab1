package se.liu.ida.sebgr273.tddd78.lab1;

/**
 * Created by sebgr273 on 2016-01-19.
 */

public class Exercise10 {
    public static void main(String[] args) {
        int tal = 16777216;
        double decimaltal = tal;
        int tillbaka = (int)decimaltal;
        int big = 2147483647;
       // int bigger = (long)big+1;

        System.out.println("tal: " + tal + " \ndecimaltal: " + decimaltal + " \ntillbaka: " + tillbaka);
        System.out.println("big: " + big /*+ "\nbigger: " + bigger*/);
    }
}
