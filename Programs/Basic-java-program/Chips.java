class University{
 String uniName="Mehran UET";

static class Student{

static void display( ){
 University muet = new University( );

String temp = muet.uniName;

System.out.print("Inside desplay ( ) method of static nested class ");
System.out.println("University is : " + temp);
}
}  // Student class is end here

public  void outerDisplay( ){
System.out.println("Calling static nested class Display method  ");

Student.display( );
}
} // end of university class 

class Chips{

public static void main (String args []){
 University myuni=new University( );

myuni.outerDisplay();
}
}
