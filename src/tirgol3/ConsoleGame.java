package tirgol3;

/*
 * public - כל אחד יכול להשתמש לשנות בדברים של המחלקה
 * private - רק המחלקה יכולה להשתמש\לשנות את הפרמטרים או פונקציות של אותה מחלקה
 */

public class ConsoleGame {
	public String name;
	String genre;
	String description;
	private int yearOfRelese;
	private double price;

	ConsoleGame(String name, String genre, String description, int yearOfRelese, double price) {
		this.name = name;
		this.description = description;
		this.genre = genre;
		this.price = price;
		this.yearOfRelese = yearOfRelese;
	}

	// משתמשים בפונקציית SET
	// בשביל לבדוק אמינות של מידע, לממש תהליכים עסקיים, וערכים של דברים במערכת
	void setPrice(double newPrice) {
		if (newPrice <= 2) {
			System.out.println("new price is lower then 2");
			this.price = 2;
		} else if (newPrice >= 50) {
			System.out.println("new price is greater then 50");
			this.price = 50;
		} else
			this.price = newPrice;
	}

	void setYearOfRelese(int newYear) {
		if (newYear < 2014)
			this.yearOfRelese = 2014;
		else if (newYear > 2020)
			this.yearOfRelese = 2020;
		else
			this.yearOfRelese = newYear;

	}

	void updateName(String newName) {
		this.name = newName;
	}

}
