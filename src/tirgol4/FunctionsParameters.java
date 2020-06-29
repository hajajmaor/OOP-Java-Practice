package tirgol4;

public class FunctionsParameters {

	static void printNum(int num) {
		System.out.println(num);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void main(String[] args) {
		int number = 8;
		// int[] arrTemp = new int[10];

		int[] arr = { 5, 8, 7, 6, 2, 5, 4, 7 };
		// להריץ עם דיבגר על שורה 19
		printNum(number);
		printArray(arr);
		System.out.println();
	}
}
