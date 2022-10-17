class Factorial{


static int num;

static void fac(int num)
{
 int fact=1;
num=5;
for(int i=1; i<=num; i++)
{
fact*=i;
}
System.out.println(fact);
}
public static void main(String args []){

System.out.println("The  Factorial is : ");

fac(num);
}
}

