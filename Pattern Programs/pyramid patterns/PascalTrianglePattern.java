import java.util.Scanner;

public class PascalTrianglePattern {
   static int factorial(int n) {
      int f;

      for(f = 1; n > 1; n--){
         f *= n;
      }
      return f;
   }
   static int func(int n,int r) {
      return factorial(n) / ( factorial(n-r) * factorial(r) );
   }
   public static void main(String args[]){
      System.out.println();
      int n, i, j;
      Scanner scn = new Scanner(System.in);
      
      //Expected Input row count
      if (scn.hasNext()){
    	  n = scn.nextInt();
      } else {
    	  n = 5;
      }
      n--;
      for(i = 0; i <= n; i++) {
         for(j = 0; j <= n-i; j++){
            System.out.print(" ");
         }
         for(j = 0; j <= i; j++){
            System.out.print(" "+ func(i, j));
         }
         System.out.println();
      }
   }
}
