import java.util.Scanner;

public class Demo1{
  
  public static void main(String[] args){  
    System.out.println("Choose a number between 1-10");
    Scanner scanner = new Scanner(System.in);
    
    int inputNum = scanner.nextInt();
    
    if(inputNum < 6){      
      System.out.println("Good Luck!!");
    }else{
      System.out.println("Try Again!!");
    }   
  }
}
