// Q no 1
import java.util.Scanner;

class Main{
 public static void main(String args []){

Scanner scan = new Scanner(System.in);

System.out.print("Enter Integer num");

int a = scan.nextInt();



int result1 =a/5000; 
int rem1 = a%5000;


int result2 =rem1/1000; 
 int rem2 = rem1%1000;

int result3 =rem2/500; 
 int rem3 = rem2%500;

int result4 =rem3/100;
int rem4 = rem3%100;

int result5 =rem4/50;
int rem5 = rem4%50;

int result6 =rem5/20;
int rem6 = rem5%20;

int result7 =rem6/10;
int rem7 = rem6%10;

int result8 =rem7/5;
int rem8 = rem7%5;

int result9 =rem8/2;
int rem9 = rem8%2;

int result10 =rem9/1;
int rem10 = rem9%1;


 
 System.out.println("5000"+ " " + result1);


 System.out.println("1000"+ " " + result2);


 System.out.println("500"+ " " + result3);

System.out.println("100"+ " " + result4);
System.out.println("50"+ " " + result5);
System.out.println("20"+ " " + result6);
System.out.println("10"+ " " + result7);
System.out.println("5"+ " " + result8);
System.out.println("2"+ " " + result9);
System.out.println("1"+ " " + result10);





}
}