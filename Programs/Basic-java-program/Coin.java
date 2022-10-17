
import java.util.Scanner;
public class Coin{

public static void main(String args []){

  Scanner input=new Scanner(System.in);

System.out.println("Enter a Integer number : ");
int x = input.nextInt();
 
int result=x/5000;
System.out.println("5000 :" + result);
 int result2=result/1000;

System.out.println("1000 :" + result);
int result3=result2/500;

System.out.println("500 :" + result);

int result4=result3/100;

System.out.println("50 :" + result4);
}
}


