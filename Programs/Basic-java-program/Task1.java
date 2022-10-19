import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character : ");
        char ch=sc.next().charAt(0);


        int size=8;
       char[] arrrays={'s','o','f','t','w','a','r','e'};
       for (int i=0; i<size; i++){
           if (ch==arrrays[i]){
               System.out.println("Character is found at index number : "+ i);
               break;
           }
           
       }

      // if ()
    }
}

// Scanner sc= new Scanner(System.in);
String str=sc.nextString