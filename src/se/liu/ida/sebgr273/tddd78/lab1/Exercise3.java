package se.liu.ida.sebgr273.tddd78.lab1;

import javax.swing.*;

/**
 * Created by sebgr273 on 2016-01-19.
 */

public class Exercise3 {

    private final static int TABELL = 5;

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please input a value");
        int tabell = Integer.parseInt(input);
        for(int i = 0; i <= tabell; i++){
            System.out.println(i + " * "+tabell + " = " + i * tabell);
        }
    }
}
