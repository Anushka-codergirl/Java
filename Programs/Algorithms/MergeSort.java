import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    void merge(int a[], int l, int mid, int r)
    {
       
        int n1 = mid - l + 1;
        int n2 = r - mid;
 
       
        int left[] = new int[n1];
        int right[] = new int[n2];
 
       
        for (int i = 0; i < n1; ++i)
            left[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = a[mid + 1 + j];
 
       
        int i = 0, j = 0;
 
       
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            }
            else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
 
       
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }
 
       
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
 
   
    void sort(int a[], int l, int r)
    {
        if (l < r) {
           
            int mid = (l + r) / 2;
 
             
            sort(a, l, mid);
            sort(a, mid + 1, r);
 
         
            merge(a, l, mid, r);
        }
    }
 
   
    static void Print(int a[])
    {
        int n = a.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
           
            System.out.print(a[i]);
            if( i != n-1)
            System.out.print(",");
           }
       
        System.out.print("]");
        System.out.println();
    }
 
   
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int no = s.nextInt();
        int a[]=new int[no];

        for( int i=0;i<no;i++) {
            a[i]=s.nextInt();
        }
 
        Solution object = new Solution();
        object.sort(a, 0, a.length - 1);
        Print(a);
    }
}