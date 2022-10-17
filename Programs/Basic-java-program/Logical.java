public class Logical{

public static void main(String args[])
{
int x=4, y=3,z=-4;
boolean result;
result=(int) x==y && y==x;
System.out.print(result);
System.out.println( );

result= x>y || y>x;
System.out.println(result);

System.out.println( );

result= x>y != y<x;
System.out.println(result);



}
}