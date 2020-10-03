import java.util.Scanner;
public class Pattern_1
{
	public static void main(String args[])
	{
		int i, j;  // loop control variables
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		
		// this loop works on the row
		for(i = 0; i < n; i++)
		{
			// this loop works on the column
			for(j = 0; j < i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}