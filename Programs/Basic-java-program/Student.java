import java.util.Scanner;

class Students{

public static void main(String args []){

Scanner input = new Scanner(System.in);

System.out.print("Enter PF subject marks : " );

int sub1 = input.nextInt();

System.out.print("Enter IICT subject marks : " );

int sub2 = input.nextInt();

System.out.print("Enter Ac subject marks : " );

int sub3 = input.nextInt();

System.out.print("Enter AP subject marks : " );

int sub4 = input.nextInt();

System.out.print("Enter FE subject marks : " );

int sub5 = input.nextInt();

float sum;

sum=sub1+sub2+sub3+sub4+sub5;

float percentage = (sum/450)*100;

System.out.print("Percentage of a Student is : " + percentage+"%" );

if(percentage==90 || percentage >=90){
System.out.print("Grade is A+");
}

else if(percentage==80 || percentage >=80){
System.out.print("Grade is B+");
}

else if(percentage==70 || percentage>=70){
System.out.print("Grade is B");
}


else if(percentage==60 || percentage >=60 ){
System.out.print("Grade is B");
}


else if(percentage<50  ){
System.out.print("Student is fail  Sorry ");
}

}
  }