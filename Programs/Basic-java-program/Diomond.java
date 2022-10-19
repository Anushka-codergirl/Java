class Diomond{

public static void main(String args []){

for(int i=1; i<=3; i++){
for(int j=1; j<=3-i; j++)
System.out.print(" ");
for(int k=1; k<=(i*2)-1; k++)
System.out.print("*");
System.out.println(" ");
}
for(int i=3-1; i>=0; i--){
for(int j=1; j<=3-i; j++)
System.out.print(" ");
for(int k=1; k<=(i*2)-1; k++)
System.out.print("*");
System.out.println(" ");
}
}
}
