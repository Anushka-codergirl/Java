public class AssignmentOperators {
    public static void main(String args[]){
        int num1 = 50;
        int num2 = 5;

        int sum = num1 + num2;
        int diff = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int rem = num1 % num2;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Multiplication = " + mult);
        System.out.println("Division = " + div);
        System.out.println("Reminder = " + rem);

        int num = 222;
        //num = num + 5; => num +=5;
        //num++  => Post increment
        //++num => Pre increment
        //num--  =>Post decrement
        //--num  => Pre decrement

        int result = --num;
        System.out.print("Result = " + result);
    }
}
