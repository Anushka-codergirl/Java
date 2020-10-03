import java.util.Scanner;
public class Triangle_num_pattern1
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number: ");
		int n = sc.nextInt();
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}