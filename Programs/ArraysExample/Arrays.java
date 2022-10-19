public class Arrays {
	public static void main(String[] args) {
		int[] numbers = new int[4];
		int numbers2[] = new int[]{ 120, 125, 520, 625 };
		// int [] numbers3, numbers4 ,numbers5;

		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for (int val : numbers2) {
			System.out.println(val);
		}
	}
}
