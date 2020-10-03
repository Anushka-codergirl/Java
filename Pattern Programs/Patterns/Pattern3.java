//5
//*****
//****
//***
//**
//*



import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst=n;
//		rows
		int row=1;
		while(row<=n) {
			
//			work
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
//			prerp
			System.out.println();
			row++;
			nst--;
			
		}
	}

}
 
