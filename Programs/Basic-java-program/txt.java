public class Main5 {

    public void divide(int a, int b){
        int c;
        if (b==0){
            throw new ArithmeticException("Value is not correct");
        }
        else{
             c=a/b;
            System.out.println(c);
        }
    }
    public void ArrayExcp(){
        int ar[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i <= ar.length; i++)
            System.out.println(ar[i]);

        throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
    }

    public void nullPointer(String a){
        if (a=="null"){
            throw new NullPointerException("this is Null pointer Exception");

        }
        else {
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
 Main5 m1 = new Main5();
 m1.divide(2,0);
 m1.ArrayExcp();
 m1.nullPointer(null);
    }
}