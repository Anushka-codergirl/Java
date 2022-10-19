class By{
String name;
int age;
String rollNum;

By( ) { name="ABC";
age= 00;
rollNum="GGG";}

By( String n, int a , String r){
name=n;
age=a;
rollNum=r;}

By (By B){
this.name=B.name;
this.age=B.age;
this.rollNum=B.rollNum;}

void duplicate(By B){
//this.name=B.name;
this.rollNum=B.rollNum;
this.name=B.name="Na";
}


public static void main(String args []){
 By b1, b2, b3,s4;
b1= new By();
b2= new By("Zobiya" , 111, "21sw140");
b3= new By(b2.name);
System.out.print(s1.name);
s4 = new By( );
s4.duplicate(s2);

}
}