import java.util.Scanner;

public class Knapsack {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int weight[] = new int[n];

		for (int i = 0; i < n; i++) {
			weight[i] = s.nextInt();
		}

		int value[] = new int[n];
		for (int i = 0; i < n; i++) {
			value[i] = s.nextInt();
		}

		int maxWeight = s.nextInt();

		System.out.println(knapsack(weight, value, maxWeight, n));
	}

	public static int knapsack(int[] weight, int value[], int maxWeight, int n) {
		return knapsack(weight, value, maxWeight, weight.length, 0);
	}

	public static int knapsack(int[] weight, int value[], int maxWeight, int n, int SI) {
		if (SI == n || maxWeight == 0) {
			return 0;
		}

		if (weight[SI] > maxWeight) {
			return knapsack(weight, value, maxWeight, n, SI + 1);
		} else {
			int opt1 = value[SI] + knapsack(weight, value, maxWeight - weight[SI], n, SI + 1);
			int opt2 = knapsack(weight, value, maxWeight, n, SI + 1);
			return Math.max(opt1, opt2);
		}
	}

}