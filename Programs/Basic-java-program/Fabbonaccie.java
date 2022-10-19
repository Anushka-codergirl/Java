class Fabbonaccie{

static int first=0, second=1,next;
static int num;

static void fab(int num)
{
num=10;
for(int i=1; i<=num; i++){

System.out.print(first+ ",");

next=first+second;
first=second;
second=next;
}
}
public static void main(String args []){

System.out.println("The  Fabbonaccie series is : ");

fab(num);
}
}

