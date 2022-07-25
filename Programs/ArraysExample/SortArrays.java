import java.util.Arrays;

public class SortArrays
{
	public static void main(String[] args)
	{
		int[] intArray = {0, 6, 2, 98, 32};
		String[] stringArray = {"Superman", "Batman", "Spiderman", "Deadpool", "Ironman"};
		
		SortIntArray(intArray);
		SortStringArray(stringArray);
	}
	
	private static void SortIntArray(int[] array)
	{
		// Loop through every element in the array
		for (int i=1; i<array.length; i++) 
		{
			// For each array element, compare with all the previous elements in the array
			for (int j = i; j > 0; j--)
			{
				if (array[j] < array[j-1])
				{
					// Swap the values around in the array
					int largerValue = array[j-1];
					
					array[j-1] = array[j];
					array[j] = largerValue;
				}
			}
		}
		
		System.out.println("Int array was sorted to " + Arrays.toString(array));
	}
	
	private static void SortStringArray(String[] array)
	{
		// Loop through every element in the array
		for (int i=1; i<array.length; i++) 
		{
			// For each array element, compare with all the previous elements in the array
			for (int j = i; j > 0; j--)
			{
				boolean compared = false;
				// Here, determining whether to values should swap places works differently to comparing ints
				// Chars have a decimal value associated with them, see http://www.asciitable.com/
				// We can use these ascii values to determine the order the elements of the array should be in
				
				// You would need to convert all of the elements to be lower/upper case if you want these to be ignored
				// This is because upper and lower case characters have different ASCII values
				int lengthToCompare = array[j].length();
				if (array[j].length() > array[j-1].length())
				{
					lengthToCompare = array[j-1].length();
				}
				for (int charPosition = 0; charPosition < lengthToCompare; charPosition++)
				{
					int firstElementAscii = (int) array[j-1].charAt(charPosition);
					int secondElementAscii = (int) array[j].charAt(charPosition);
					
					if (firstElementAscii != secondElementAscii)
					{
						compared = true;
						if (secondElementAscii < firstElementAscii)
						{
							// Swap the values around in the array
							String largerValue = array[j-1];
					
							array[j-1] = array[j];
							array[j] = largerValue;
						}
						break;
					}
				}
				// If we haven't been able to compare the strings (e.g. tower and towers),
				// because their first n chars match, where n is the length of the shortest string,
				// the longer string will be placed after the shorter one
				if (!compared)
				{
					if (array[j].length() > array[j-1].length())
					{
						// Swap the values around in the array
						String largerValue = array[j-1];
				
						array[j-1] = array[j];
						array[j] = largerValue;
					}
				}
			}
		}
		
		System.out.println("String array was sorted to " + Arrays.toString(array));
	}
}