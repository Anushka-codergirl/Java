import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesInArray {
	
	//Remove Duplicate Character from 2 array and display array in sorted order
	public static void main(String[] args) {
		String[] array1 = {"Goa", "Gujarat", "Bihar", "Odisha", "Assam", "Kerala", "Goa", "Karnataka"};
		String[] array2 = {"Karnataka", "Bihar", "Maharashtra", "West Bengal", "Tripura", "Uttar Pradesh", "Sikkim"};
		
		ArrayList<String> list = new ArrayList<String>( Arrays.asList(array1));
		// Merging 2 arrays
		list.addAll(Arrays.asList(array2));
		System.out.println("Merged Array: "+list);
		Set<String> set = new TreeSet<String>();
		// Duplicates removed and sorted  
		set.addAll(list);		
		System.out.println("Sorted after removing duplicates: "+set);
		
		// Converting back to array
		array1 = set.toArray(array1);
		System.out.println("Sorted Array: "+Arrays.toString(array1));	
	}
}
