class CarCompany{


class Car{

String carType = "Electric";
String color = "Black";
int engineNo = 1776;
int capacity = 133;
static int noOfWheels= 4;

void display(){

System.out.print("Inside desplay ( ) method of  nested class ");
System.out.println("Car Type is  : " + carType);
System.out.println("Color is is  : " + color);
System.out.println("Engine no  is  : " + engineNo);
System.out.println("Capacity is  : " + capacity);
System.out.println("Number of wheels is : " + noOfWheels);
}
}// Inner class is closed here 

public void outerDisplay( ){
System.out.println("Calling  nested class Display method  ");

Car sedan = new Car();
Car hatchback = new Car();
sedan.display();
}
}

class Glass{

public static void main(String args [] ){

CarCompany myCompany= new CarCompany();
myCompany.outerDisplay();
}
}
