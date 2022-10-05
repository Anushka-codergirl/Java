import java.util.Scanner;

public class salary {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("ENter name:-\nAge:-\nSalary:-\n");
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Salary " + salary);
    }
}
