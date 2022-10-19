import java.util.Scanner;

class Vowel{

public static void main(String args []){

Scanner input=new Scanner (System.in);

System.out.print("Enter a Character :" );
char ch = input.next( ).charAt(0);

switch(ch){

case 'a' :
System.out.print("Character is a consonant : " + ch);
break;
 
case 'e' :
System.out.print("Character is a consonant : " + ch);
break;

case 'i' :
System.out.print("Character is a consonant : " + ch);
break;

case 'o' :
System.out.print("Character is a consonant : " + ch);
break;

case 'u' :
System.out.print("Character is a consonant : " + ch);
break;
 
default :
 System.out.print("Character is a vowel : " + ch);
}
}
}
 
 