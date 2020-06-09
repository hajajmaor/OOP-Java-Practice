package tirgol3;

public class ConsoleGameMain {

	
	/*
	 * public - כל אחד יכול להשתמש לשנות בדברים של המחלקה
	 * private - רק המחלקה יכולה להשתמש\לשנות את הפרמטרים או פונקציות של אותה מחלקה
	 */
	
	public static void main(String[] args) {
		ConsoleGame candyCrash=new ConsoleGame("candy crush","mobile game",
				"boring game with diffrent kind of fruits",2012,3); 
//		
		ConsoleGame rocketLeague=new ConsoleGame(
				"rocket league","awosme game","football with cars",2016,25);
		
		candyCrash.name="fdsfdsfsdfsd";
		
//		candyCrash.updatePrice(1.5);
		candyCrash.setPrice(0);
		rocketLeague.name="new rocket league name bla bla";
		rocketLeague.name="new roce bla bla";
		rocketLeague.name="nebla bla";
				

		System.out.println();
	}

}
