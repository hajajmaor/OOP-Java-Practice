package tirgol1;

import java.util.Scanner;

public class PrintAstrixs {

	/*
	 * lines = 6
	 *
	 **
	 ***
	 ****
	 *****
	 ******
	 */
	static void printTriangle(int lines) {
		for (int i = 1; i <= lines; i++) {
			printAstrixsInLine(i);
			System.out.println();
		}
	}

	static void printAstrixsInLine(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print('*');
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter number of lines: ");
		int lines = input.nextInt();
		printTriangle(lines);

		input.close();
	}
}
