package se.liu.ida.sebgr273.tddd78.lab1;

import javax.swing.*;

/**
 * Created by sebgr273 on 2016-01-19.
 */

public class Exercise2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("while or for?");
        String value = JOptionPane.showInputDialog("Minimal value: ");
        int min = Integer.parseInt(value);
        value = JOptionPane.showInputDialog("Maximal value");
        int max = Integer.parseInt(value);

        switch (input) {
            case "while" :
                System.out.println(sumWhile(min, max));
                break;
            case "for":
                System.out.println(sumFor(min, max));
                break;
            default:
                System.out.println("Choose either while or for!");
        }
    }

    public static int sumFor(int min, int max){
            int sum = 0;
            for(int i = min; i <= max; i++){
                sum += i;
            }
            return sum;
        }

    public static int sumWhile(int min, int max){
        int sum = 0;
        while(min <= max){
            sum += min;
            min++;
        }
        return sum;
    }
}
