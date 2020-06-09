package tirgol1;

import java.util.Scanner;

public class SwitchDay {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 1-7: ");
		int num = input.nextInt();

		switch (num) {
			case 1:
				System.out.println("Sunday");
				break;

			case 2:
				System.out.println("monday");
				break;

			default:
				System.out.println("enterd wrong number");
				break;
		}

		input.close();
	}

}
