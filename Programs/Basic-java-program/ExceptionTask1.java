import  java.util.Scanner;
public class ExceptionTask1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter num one : ");
        int num1= sc.nextInt();
        System.out.println("Enter num two : ");
        int num2=sc.nextInt();
        int result=0;
        try {
            result = num1/num2;
        }
        catch (ArithmeticException e){
            System.out.println("Divide by 0 is not valid this is ArithmeticException");
        }

    }
}
