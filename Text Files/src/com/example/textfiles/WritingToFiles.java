package com.example.textfiles;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles
{
    public static void main(String[] args) throws IOException
    {
        //create the file and open the file
        //if the file exists it will replace the file
        PrintWriter outputFile = new PrintWriter("OutputFile.txt");

        outputFile.println("This is line 1");
        outputFile.println("This is line 2");
        outputFile.println("This is line 3");

        outputFile.close();
    }
}
