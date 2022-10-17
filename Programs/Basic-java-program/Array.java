public class Array{

public static void main(String args []){

// System.out.print(args[0]);

/*for(int i=0; i<args.length; i++){
System.out.println(args[i]); */
 
 int sum=0;
for(int i=0; i<args.length; i++)
sum=sum+Integer.parseInt(args[i]);
System.out.print("sum ="+sum);

}
  }