package tirgol4;

public class StoreMain {

	public static void main(String[] args) {
		/*
		 * Store st1 = new Store("Peres 10, rehovot", "Zara", 3); ClothingItem ci1 = new
		 * ClothingItem("M", "rEd", "adidas"); ClothingItem ci2 = new ClothingItem("S",
		 * "Green", "adidas"); ClothingItem ci3 = new ClothingItem("l", "blACK",
		 * "adidas"); st1.addClothingItem(ci1); st1.addClothingItem(ci2);
		 * st1.addClothingItem(ci3);
		 * 
		 * // פריט לבוש מספר 4 לחנות בגודל 3 ClothingItem ci4 = new ClothingItem("XXL",
		 * "YelLOW", "zara"); // st1.addClothingItem(ci4); System.out.println(ci1); //
		 * st1.addClothingItem();
		 * 
		 */
		Store st2 = new Store("Rehovot", "JAVA", 7);
		ClothingItem ci1 = new ClothingItem("M", "rEd", "adidas");
		ClothingItem ci2 = new ClothingItem("S", "Green", "adidas");
		ClothingItem ci3 = new ClothingItem("l", "blACK", "adidas");
		st2.addClothingItem(ci1);
		st2.addClothingItem(ci2);
		st2.addClothingItem(ci3);
		System.out.println(st2);
	}

}
