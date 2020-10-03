import java.util.Scanner;
public class Pattern_4
{
	public static void main(String args[])
	{
		int i, j, k = 16, s = 1;
		
		//this loop work on the row
		for(i = 0; i < 5; i++)
		{
			//this loop work on space
			for(j = 0; j < k; j++)
			{
				System.out.print(" ");
			}
			//decrement k for reduce the spaces in the next row
			k = k - 4;
			
			//this loop work on the column
            //here we want to print * two more than the previous row
            //so this loop work on the k
			for(j = 1; j <= s; j++)
			{
				System.out.print("* ");
			}
			s = s + 2;
			System.out.println();
		}
		
	}
}