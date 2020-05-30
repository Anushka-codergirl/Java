package com.example.textfiles;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles
{
    public static void main(String[] args) throws IOException
    {
        int sum = 0;
        int count = 0;
        double average;
        File file = new File("OutputFile.txt");

        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext())
            {
               sum = sum + inputFile.nextInt();
               count++;
            }

            inputFile.close();
            average = sum / (double)count;

            JOptionPane.showMessageDialog(null,"Sum of all values: " + sum + "\n" + "The number of values: " + count + "\n" + "The average is: " + average);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"The file does" + "not exists!");
        }
    }
}

