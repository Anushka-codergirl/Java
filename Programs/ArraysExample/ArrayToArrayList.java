import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String args[]) {
		String[] alphabets= { "a", "b", "c", "d", "e" };

		// Create a new list. Iterate the array and add each element to the list.
		List<String> list = new ArrayList<String>();
		for (String alphabet : alphabets) {
			list.add(alphabet);
		}
		System.out.println(list);
	}
}
