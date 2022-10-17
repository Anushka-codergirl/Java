import java.util.Scanner;

class Runtime{

public static void main(String args []){


Scanner input = new Scanner(System.in);

System.out.print("Enter a first number : ");

int num1= input.nextInt();

System.out.println("Enter a second number : ");

int num2 =input.nextInt();

System.out.println("Enter Any Operation [+,-,*,/] : ");

char ch =input.next( ).charAt(0);
float sum,product,sub,division;

switch(ch)
{
case '+' :
sum=num1+num2;
System.out.print("Sum of two number is : " + sum);
break;
 
case '-' :
sub=num1-num2;
System.out.print("Sub of number one  from number two  is  : " + sub);
break;

case '*' :
product=num1*num2;
System.out.print("product of two number is  : " + product);
break;

case '/' :
division=num1/num2;
System.out.print("Division of number 1 with number 2 is : " + division);
break;


default :
 System.out.print("DEfault ");
}
}
}