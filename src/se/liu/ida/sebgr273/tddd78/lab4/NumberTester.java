package se.liu.ida.sebgr273.tddd78.lab4;

/**
 * Created by Sebastian on 2016-02-09.
 */
public class NumberTester
{
    private NumberTester() {}

    public static boolean isEven(Integer number) {
        int remainder = number % 2;
        return remainder == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(17));
        System.out.println(isEven(42));
    }
}
