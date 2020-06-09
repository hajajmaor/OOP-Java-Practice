package tirgol1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		// Scanner כלי לביצוע קלט מטרמינל השחור, או עבודה עם קבצים
		Scanner input = new Scanner(System.in);

		// הדפסה ללא ירידת שורה
		System.out.print("please enter your name:");
		// קלט של הטקסט עד הרווח, לא כל השורה ללא המרה למשתנה אחר אלא לסטרינג
		String name = input.next();

		// הדפסה של טקסט בשירשור עם ירידת שורה
		System.out.println("Hello " + name);

		// סגירת קלט - חובה על מנת למנוע זליגת זיכרון
		input.close();
	}

}
