package tirgol2;

import java.util.Scanner;

public class Functions {

	/*
	 * [1,23,4,56,2,-8,-50] 1. מקבלת מערך מחזירה ממוצע 2. מחזירה MAX 3. מחזירה MIN
	 * 4. מחזירה אמת אם כל המספרים הם זוגיים, אחרת שקר
	 */

	static int avg(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum / nums.length;
	}

	static int max(int[] nums) {

		int max = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}

	static int min(int[] nums) {

		int min = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}

	static boolean allPositive(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] nums = new int[3];

		for (int i = 0; i < nums.length; i++) {
			System.out.print("enter number: ");
			nums[i] = input.nextInt();
		}

		if (allPositive(nums) == true) {
			System.out.println("array is all positive");
		} else {
			System.out.println("array is not positive");
		}

		System.out.println("array avg is: " + avg(nums));
		System.out.println("array min : " + min(nums));
		System.out.println("array max : " + max(nums));

		input.close();
	}

}
