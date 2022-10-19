class Car{
 
static int num_of_weeks;

Car( ){ ++num_of_weeks;}

public static void main(String args []){

System.out.println(Car.num_of_weeks); // without constructer output is 0

Car.num_of_weeks=4;
System.out.println(Car.num_of_weeks); // in main function we give value 4

Car car1=new Car( );

System.out.println(car1.num_of_weeks); //with the constructer 5
}
}