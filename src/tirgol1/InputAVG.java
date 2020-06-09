package tirgol1;

import java.util.Scanner;

public class InputAVG {

	public static void main(String[] args) {

		int sum = 0;
		int counter = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {

			System.out.print("Please enter a number: ");
			int num = input.nextInt();

			if (num % 2 == 0) {
				sum += num;
				counter++;
			}
		}

		System.out.println("avg is: " + (sum / counter));

		input.close();
	}

}
