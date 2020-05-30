package com.example.methods;

public class Methods
{
    public static void main(String[] args)
    {
        printAverage(20, 30);
        double average = getAverage(20,40);
        System.out.println("Average: " + average);
        String fullName = fullName("Anushka", "Raj");
        System.out.println(fullName);
        int value = 20;
        if(isValid(value))
        {
            System.out.println("The value is in range!");
        }
        else
        {
            System.out.println("The value is not in range");
        }
    }

    /****
     * This method prints the average of two numbers
     * @param val1 The first value
     * @param val2 The second value
     */
    public static void printAverage(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;
        System.out.println("Average: " + average);
    }

    /****
     * This method calculates the average and return it
     * @param val1 The first value
     * @param val2 The second value
     * @return The average of two values
     */
    public static double getAverage(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;
        return average;
    }

    public static String fullName(String name, String surname)
    {
        return  name + " " + surname;
    }

    //range between 1 and 100
    public static boolean isValid(int number)
    {
        boolean status;

        return (number >= 1 && number <=100);

    }
}
