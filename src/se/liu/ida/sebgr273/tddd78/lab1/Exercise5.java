package se.liu.ida.sebgr273.tddd78.lab1;

/**
 * Created by sebgr273 on 2016-01-19.
 */

public class Exercise5 {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++){
            if (isPrime(i))
                System.out.println(i + " is a prime!");
        }
    }

    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++) {
            if ((number % i) == 0 )
                return false;
        }
        return true;
    }
}
