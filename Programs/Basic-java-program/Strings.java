import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        int size=8;

     char ch[]=new char[size];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a characters String :");
        for (int i=0; i<size; i++){
         ch[i]= sc.next().charAt(0);
        }
        System.out.println("Enter  a character that you want to search :");
        char ch2=sc.next().charAt(0);



        for (int j=0; j<ch.length; j++){
            if(ch2==ch[j]){
                System.out.println("Character is found at index of : "+j);
                break;  }


        }
             }
                 }