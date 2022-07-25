import java.util.Scanner;
public class Diamond_star_pattern
{

	public static void diamond(int rows)
	{
		int i, j, k = 0;
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= rows-i; j++)
			{
				System.out.print(" ");
			}
			for(j = 1; j <= (2*i-1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//declare for loop for print reverse pyramid
		for(i = rows-1; i > 0; i--)
		{
			for(j = 1; j <= rows-i; j++)
			{
				System.out.print(" ");
			}
			for(j = 1; j <= (2*i-1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void halfDiamond(int rows)
	{																			//		*
		int i, j, k = 0;														//		**
		for(i = 0; i < rows; i++)												//		***
		{																		//		****
			if(i<=(rows/2))														//		***
			{																	//		**
				for(j = 0; j <= i; j++)											//		*
				{
					System.out.print("*");
				}
			}
			else
			{
				for(j = i; j < rows; j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	public static void inverted_halfDiamond(int rows)						//  		 *
	{																		//			**
		int i,j,k;															//		   ***
		for ( i = 0; i < rows; i++)											//		  ****
		{ 																	//		   ***
			if(i <= (rows/2))												//			**
			{																//			 *
				for(k = (rows/2); k > i; k--)								
				{
					System.out.print(" ");
				}
				for(j = 0; j <= i; j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(k = rows/2; k < i; k++)
				{
					System.out.print(" ");
				}
				for(j = i; j < rows; j++)
				{
					System.out.print("*");
				}
			} 
            System.out.println(); 
		}
	}
	
	public static void printPattern(int rows)
	{
		System.out.println("Diamond: ");
		diamond(rows);
		System.out.println();
		System.out.println("Half Diamond: ");
		halfDiamond(rows);
		System.out.println();
		System.out.println("inverted Half Diamond for odd rows: ");
		inverted_halfDiamond(rows);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number of row: ");
		int rows = sc.nextInt();
		printPattern(rows);
	}
}