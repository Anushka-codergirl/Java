import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean isOnRepeat = true;
    while(isOnRepeat){
      System.out.println("Playing current video");
      System.out.println("Would you like to take this video off of repeat ? If so, say yes!");
      String userInput = input.next();
      if(userInput.equals("yes")){
        isOnRepeat = false;
      }
    }
    System.out.println("Playing next video");
  }

}
