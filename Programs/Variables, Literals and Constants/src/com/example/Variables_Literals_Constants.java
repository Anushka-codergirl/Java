package com.example;

import com.sun.nio.sctp.SctpSocketOption;

public class Variables_Literals_Constants {
    public static void main(String[] args){
        int firstNumber;
        int secondNumber;

        firstNumber = 11;
        secondNumber = 20;

        double average;

        average = (firstNumber + secondNumber) / 2.0;

        System.out.println("Average: " + average);

        String name;
        String surname;

        name = "Anushka";
        surname = "Raj";

        System.out.println(name + " " + surname);

        boolean value;
        value = true;

        System.out.println(value);

        char letter;
        letter = 'A';

        System.out.println(letter);
    }
}
