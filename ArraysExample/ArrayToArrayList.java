import java.util.ArrayList;

public class ArrayToArrayList {
   public static void main(String args[]) {
      String[] array = {"a", "b", "c", "d", "e"};

      //Create a new list. Iterate the array and add each element to the list.
      ArrayList<String> list = new ArrayList<String>();
      for(String text:array) {
         list.add(text);
      }
      System.out.println(list);
   }  
}

