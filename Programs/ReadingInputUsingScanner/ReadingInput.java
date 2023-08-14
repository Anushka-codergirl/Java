import java.net.SocketOption;
import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args){

        int firstNumber;
        int secondNumber;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        firstNumber = sc.nextInt();

        System.out.println("Please enter the second number");
        secondNumber = sc.nextInt();

        double average = (firstNumber + secondNumber) / 2;

        System.out.println("The average is:" + average);

        String name;
        String surname;

        sc.nextLine();
        System.out.println("Please enter your name");
        name = sc.nextLine();

        System.out.println("Please enter your surname");
        surname = sc.nextLine();

        System.out.println();
    }
}
