import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (i == n) {
                    System.out.print("*  ");
                } else {
                    if (j == i || j == 0) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println("");
        }

    }
}
