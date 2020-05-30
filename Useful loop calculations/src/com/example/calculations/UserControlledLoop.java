package com.example.calculations;


import javax.swing.*;

public class UserControlledLoop
{
    public static void main(String[] args)
    {
        int maxValue;

        String input = JOptionPane.showInputDialog("How high should I go to square the number?");
        maxValue = Integer.parseInt(input);

        System.out.println("Number          Number squares");
        System.out.println("------------------------------");

        for(int number = 1 ; number <=maxValue; number++)
        {
            System.out.println(number + "\t\t\t" + number*number);
        }
    }
}
