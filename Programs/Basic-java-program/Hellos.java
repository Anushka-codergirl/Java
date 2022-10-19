class Example{

int x; // Instance member
private static int y; // Static member variable

public void fun1( ) { }// Instance member function
public static int fun2( )
 {return  y=4;} // static member function

static class Test{
public static String country="Pakistan";
}
  }

public class Hellos{
public static void main(String[] args)
{
Example ex1=new Example();

System.out.print(Example.fun2( ));
System.out.println(Example.Test.country);
}
  }