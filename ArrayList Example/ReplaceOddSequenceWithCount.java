import java.util.*;
import java.io.*;

public class ReplaceOddSequenceWithCount {
public static int processArray(ArrayList<Integer> array) {
    int count=0;
    for(int i=0;i<array.size();i++)
    {
        if((array.get(i)%2)!=0) //odd
        {
            count++;
            if(count>1)     //I had to replace length of  odd seq greater than or equal to 2
            {
                array.set(i,count);     //set curren count to current odd no and remove previous odd number
                array.remove(i-1);
                if(i>0)     //For handling change in indices
                    i=i-1;
                else
                    i=0;
            }
        }
        else
        {
            count=0;
        }
    }
    return array.size();
}

    public static void main (String[] args) {
        ArrayList<Integer> arrayL = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            int number = s.nextInt();
            if (number < 0) 
                break;
            arrayL.add(new Integer(number));
        }
        int new_l = processArray(arrayL);
        for(int i=0; i<new_l; i++)
            System.out.println(arrayL.get(i));
    }
}
