import java.util.Scanner;
public class Pattern_3
{
	public static void main(String args[])
	{
		int i, j, k = 8;
		
		// this loop works on the row
		for(i = 0; i < 5; i++)
		{
			// this loop works for spaces
			for(j = 0; j < k; j++)
			{
				System.out.print(" ");
			}
			
			// decrement k to reduce the spaces in next row 
			k = k - 2;
			
			// this loop works to print the '*'
			for(j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}