import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name = myObj.nextLine();
		
		System.out.println("\nEnter Age:");
		int age = myObj.nextInt();
		
		System.out.println("\nEnter Salary:");
		double salary = myObj.nextDouble();
		
		System.out.printf("Name: %s Age: %d Salary: %.2f", name, age, salary);

	}
}
