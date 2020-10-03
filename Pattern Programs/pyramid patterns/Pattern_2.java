import java.util.Scanner;
public class Pattern_2
{
	public static void main(String args[])
	{
		int i, j, k = 1;
		Scanner sc = new Scanner(System.in);
		// input taking from the console
		System.out.println("Enter a number: ");			
		int n = sc.nextInt();
		
		// this loop works on the row
		for(i = 0; i < n; i++)
		{
			// this loop works on the column
			// here, we want to print * two more than previous row 
			// so this loop works on the 'k' variable
			for(j = 0; j < k; j++)
			{
				System.out.print("* ");
			}
			
			// increment 'k' with 2
			k = k + 2;
			System.out.println();
		}
	}
}