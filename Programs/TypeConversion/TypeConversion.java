public class TypeConversion {
    public static void main(String args[]){

        byte a  = 127;
        int b = a;
        int c = 223;
        byte  d = (byte) c;

        float f = 5.6f;
        int i = (int) f;

        byte e = 10;
        byte t = 20;

        int result = e*t;

        System.out.println(a);
        System.out.println(d);
        System.out.println(i);
        System.out.println(result);
    }
}
