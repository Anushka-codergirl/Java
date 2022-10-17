
import java.util.Scanner;

class Cast{
 public static void main(String args []){

Scanner scan = new Scanner(System.in);

System.out.print("Enter the value");

double d = scan.nextDouble();

int n=(int)d;
System.out.println("Integer value is : " + " " + n);
double f=d-n;
System.out.println("fraction value is : " + " " + f);

}
}



