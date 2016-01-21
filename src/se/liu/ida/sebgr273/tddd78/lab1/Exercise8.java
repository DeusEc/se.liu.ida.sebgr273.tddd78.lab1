package se.liu.ida.sebgr273.tddd78.lab1;

import javax.swing.*;

/**
 * Created by sebgr273 on 2016-01-19.
 */

public class Exercise8 {
    public static void main(String[] args) {
        while(true){
            if(askUser("Quit!") && askUser("Really?"))
                return;
            else
                System.out.println("The program continues");
        }
    }

    private static boolean askUser(String question) {
        if( JOptionPane.showConfirmDialog(null, question, "",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            return true;
        return false;
    }
}
