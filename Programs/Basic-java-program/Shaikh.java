class College{

String uniName="Mehran UET";
class Student{
void display(){

System.out.print("Inside desplay ( ) method of  nested class ");
System.out.println("University is : " + uniName);
}
}

public void outerDisplay(){
System.out.println("Calling  nested class Display method  ");

Student s1 = new Student( );
s1.display();
}
}
class Shaikh{

public static void main(String args [] ){
College mycolly=new College( );
mycolly.outerDisplay();
}
}
