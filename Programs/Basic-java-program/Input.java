import java.util.Scanner;

class Input{

public static void main(String args []){

Scanner scan = new Scanner(System.in);
System.out.print("Enter a number : ");

int a =scan.nextInt();
System.out.println("Enter a second number ");
int b = scan.nextInt();
int sum = a+b;
System.out.println(" Sum is " + " " + sum);
}
}
