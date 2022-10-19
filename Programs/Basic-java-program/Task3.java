public class Task3 {
    public static void main(String [] args){
        float sum,average;
        float a1=Float.parseFloat(args[0]);
        float a2=Float.parseFloat(args[1]);
        float a3=Float.parseFloat(args[2]);
        float a4=Float.parseFloat(args[3]);
        float a5=Float.parseFloat(args[5]);

        sum=a1+a2+a3+a4+a5;
        System.out.println("Sum is : "+sum);
        average = sum/5;
        System.out.println("average is : "+ average);
    }
}