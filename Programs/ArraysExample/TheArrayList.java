import java.util.ArrayList;

public class TheArrayList
{
    public static void main(String[] args) {

        //Standard Java arrays are of a fixed length.After arrays are created
        //they cannot grow or shrink, which means that you must know in advance
        //how many elements an array will hold.

        //Array lists are created with an initial size.When this size is exceeded,
        //the collection is automatically enlarged.When objects are removed,
        //the array may be shrunk

        ArrayList<String> names = new ArrayList<>();

        names.add("Amaya");//0
        names.add("Arya");//1
        names.add("Aman");//2
        names.add("Jazz");//3
        names.add(4,"John");//4
        names.add(3,"Paul");
        names.set(1,"Peter");

        for (int i = 0; i< names.size();i++)
        {
            System.out.println(names.get(i));
        }
    }
}
