
import java.util.Scanner;

class Circle{
 public static void main(String args []){

Scanner scan = new Scanner(System.in);

System.out.print("Enter a radius of 2 circle num");

double r1 = scan.nextInt();

double r2 = scan.nextInt();

double circum1=r1*3.14*3.14;

double circum2=r2*3.14* 3.14;

System.out.println("Circumpherence of circle 1 is " + " " + circum1 );
System.out.println("Circumpherence of circle  2 is " + " " + circum2 );

double d1 = 2*r1;
double d2 = 2*r2;

System.out.println("Diameter of 1 is  " + " " + d1 );
System.out.println("Diameter of 2 is  " + " " + d2 );

double a1 = 3.14*r1*r1;
double a2 = 3.14*r2*r2;

System.out.println("area 1 is   " + " " + a1 );
System.out.println("area 2 is   " + " " + a2 );


}
}


