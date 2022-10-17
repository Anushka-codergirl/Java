class Task1 {

    public  int sum(int a, int b) {
        System.out.print("Sum of two number is : ");
         return a+b;
    }

    public  int sub(int a, int b) {
  System.out.print("The Difference of  b from a is : ");
        return a - b;
    }

    public  int multiplication(int a, int b) {
       System.out.print("Multiplication of two number is : ");
        return a * b;
    }

    public  float division(float a, float b) {
 System.out.print("Division of two number is : ");
        return a / b;
    }

}

 public class Run{
    public static void main(String[] args) {
        Task1 t1=new Task1();

       int result1=t1.sum(23,45);
System.out.println(result1);
        int result2 =t1.sub(23,22);
    System.out.println(result2);

        int result3=t1.multiplication(23,12);
        System.out.println(result3);

        float result4= t1.division(20,15);
        System.out.print(result4);




    
     
    }
}
