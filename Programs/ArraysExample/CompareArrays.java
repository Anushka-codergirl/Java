public class CompareArrays {
	public static void main(String[] args) {
		int[] numbers1 = { 2, 4, 6, 8, 10 };
		int[] numbers2 = { 2, 4, 6, 8, 10 };

		boolean areArraysEqual = true;
		int i = 0;
		
		int numbers1Length = numbers1.length, numbers2Length = numbers2.length;

		if (numbers1Length != numbers2Length) {
			areArraysEqual = false;
		}

		while (i < numbers1Length) {
			if (numbers1[i] != numbers2[i]) {
				areArraysEqual = false;
				break;
			}
			i++;
		}
		
		System.out.printf("They are %s same!\n", areArraysEqual? "the" : "not");
	}
}
