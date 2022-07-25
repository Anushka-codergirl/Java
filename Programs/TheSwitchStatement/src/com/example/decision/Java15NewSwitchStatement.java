package com.example.decision;

import javax.swing.*;

/**
 * @author Alessandro Arosio - 03/10/2020 17:02
 */
public class Java15NewSwitchStatement {
    public static void main(String[] args) {
        int number;
        String input = JOptionPane.showInputDialog("Please enter 1,2 or 3: ");
        try {
            number = Integer.parseInt(input);
            switch (number) {
                case 1 -> JOptionPane.showMessageDialog(null,"You entered 1!");
                case 2 -> JOptionPane.showMessageDialog(null,"You entered 2!");
                case 3 -> JOptionPane.showMessageDialog(null,"You entered 3!");
                case 4 -> JOptionPane.showMessageDialog(null,"You entered 4!");
                default -> JOptionPane.showMessageDialog(null,"You did not enter 1,2,3 or a 4!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Don't cheat... it has to be a number!");
        }
    }
}
