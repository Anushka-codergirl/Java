
import java.util.Scanner;
public class Pattern_1
{
	public static void main(String args[])
	{
		int a, b;  // loop control variables
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		
		// this loop works on the row
		for(a = 0; a < n; a++)
		{
			// this loop works on the column
			for(b = 0; b < a ; b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}