package se.liu.ida.sebgr273.tddd78.lab1;

import javax.swing.*;

/**
 * Created by sebgr273 on 2016-01-19.
 */

public class Exercise9 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please input a value");
        double inp = Double.parseDouble(input);
        System.out.println("Roten ur "+input+" är "+findRoot(inp));
    }

    private static double findRoot(double number){
        double x = number;

        for(int i = 0; i <= 10; i++){
            x = x - (x*x-number)/(x*2);
        }
        return x;
    }
}
