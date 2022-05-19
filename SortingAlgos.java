package concepts;

public class SortingAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingAlgos algo = new SortingAlgos();

		int[] a = { 2, 5, 9, 1, 8, 3, 0 };
		int[] b = { 78, 3, 6, 48, 79, -32, 4 };
		printArray(a);
		printArray(b);

		algo.bubbleSort(a);
		algo.insertionSort(b);
		algo.slectionSort(a);

		printArray(a);

	}

	private void slectionSort(int[] b) {
		// TODO Auto-generated method stub
		int n = b.length;
		for (int i = 0; i < n - 1; i++) {
			int minpos = i;
			for (int j = i + 1; j < n; j++) {
				if (b[j] < b[minpos])
					minpos = j;
			}
			if (minpos != i)
				swap(b, i, minpos);
		}

	}

	private void insertionSort(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}

	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");

	}

	public void bubbleSort(int[] a) {
		int n = a.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
			}
		}
	}

	private void swap(int[] a, int j, int i) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
