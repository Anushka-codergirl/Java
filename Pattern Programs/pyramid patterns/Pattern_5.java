import java.util.Scanner;
public class Pattern_5
{
	public static void main(String args[])
	{
		int i, j, k = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		//this loop work on the row
		for(i = 1; i <= n; i++)
		{
			//this loop work for both the space and print *
			for(j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			
			//until value of the k is not equal to 2*i-i, it print star
			while(k != (2*i-1))
			{
				System.out.print("*");
				k++;
			}
			k = 0;
			System.out.println();
		}
		
	}
}