package tirgol1;

import java.util.Scanner;

public class Question7Mod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] nums = new int[5];
		int positiveSum = 0;
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.print("enter number: ");
			nums[i] = input.nextInt();
			if (nums[i] % 2 == 0) {
				counter++;
				positiveSum += nums[i];
			}
		}
		System.out.println("number of positive numbers is: " + counter);
		System.out.println("sum of positive numbers is: " + positiveSum);
		input.close();
	}

}
