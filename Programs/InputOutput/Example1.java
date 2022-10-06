import java.util.Scanner;

public class Example1{
    public static void main(String[] args){
        double studentGPA = 3.45;
		String studentFirstName = "Anushka";
		String studentLastName = "Raj";

		System.out.printf("%s %s has a GPA of %.2f.\n", studentFirstName, studentLastName, studentGPA);
		System.out.println("Enter GPA you want to update it to:");

		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();

		System.out.printf("%s %s now has a GPA of %.2f.\n", studentFirstName, studentLastName, studentGPA);

		input.close();
    }
}
