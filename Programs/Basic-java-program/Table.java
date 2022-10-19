 import java.util.Scanner;

class Table{

public static void main(String args [ ] ){

Scanner scan = new Scanner(System.in);
System.out.print("Enter a start point : ");

int start =scan.nextInt();

System.out.println("Enter a end point  ");
int end = scan.nextInt();

System.out.println("Enter a table no : ");
int num = scan.nextInt();
int product;

for( int i=1; i<=10; ++i){
if(i==end)
break;
product=num*start;
System.out.println(num+"*"+start+"="+product);

start++;

}

}
}

