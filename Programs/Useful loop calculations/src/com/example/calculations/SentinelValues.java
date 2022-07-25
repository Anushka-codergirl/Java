package com.example.calculations;

import javax.swing.*;

public class SentinelValues
{
    public static void main(String[] args)
    {
        int value;
        int doubleVlaue;

        String input = JOptionPane.showInputDialog("Please enter a value to double " + "(0 to stop)");

        value = Integer.parseInt(input);

        while (value != 0)
        {
            doubleVlaue = value * 2;
            JOptionPane.showMessageDialog(null,"" + value + " doubled is " + doubleVlaue);

            input = JOptionPane.showInputDialog("Please enter a value to double " + "(0 to stop)");

            value = Integer.parseInt(input);

        }
        System.exit(0);
    }
}
