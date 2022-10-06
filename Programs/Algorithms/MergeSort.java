import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	void merge(int a[], int l, int mid, int r) {

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
				a[k] = left[i++];
			} else {
				a[k] = right[j++];
			}

			k++;
		}

		while (i < n1) {
			a[k++] = left[i++];
		}

		while (j < n2) {
			a[k++] = right[j++];
		}
	}

	void sort(int a[], int left, int right) {
		int mid = 0;
		if (left < right) {

			mid = left + ((right - left) >> 1);

			sort(a, left, mid);
			sort(a, mid + 1, right);

			merge(a, left, mid, right);
		}
	}

	static void printArray(int a[]) {
		System.out.println(Arrays.toString(a));
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		int a[] = new int[numberOfElements];

		for (int i = 0; i < numberOfElements; i++) {
			a[i] = sc.nextInt();
		}

		Solution object = new Solution();
		object.sort(a, 0, numberOfElements - 1);

		printArray(a);

		sc.close();
	}
}
