package tirgol4;

public class Store {
	private String address;
	private String name;
	// אתחול של מערכים כתכונות יתבצע בפונקציה בונה
//	ClothingItem[] shirts = new ClothingItem[5];
	private ClothingItem[] shirts;
	private int index;// לא עושים GET SET בשביל שלא יהיה ניתן לשינוי

	public Store(String address, String name, int amountOfClothes) {
		this.address = address;
		this.name = name;
		this.shirts = new ClothingItem[amountOfClothes];// 5
		this.index = 0;
	}

	void addClothingItem(ClothingItem item) {
		if (this.index >= this.shirts.length) {
			System.out.println("no free room in the array");
		} else {
			this.shirts[this.index] = item;
			index++;
		}
	}

	public ClothingItem[] getShirts() {
		return this.shirts;
	}

	public void setShirts(ClothingItem[] newStackOfShirts) {
		for (ClothingItem clothingItem : newStackOfShirts) {// ניקח בגד בגד ונוסיף לחנות שלנו
			this.addClothingItem(clothingItem);
		}
	}

	public String toString() {
		String temp = "Store Name: " + this.name;
		temp += "\naddress: " + this.address;

//		for (ClothingItem shirt : this.shirts) {
//			temp += shirt.toString();
//		}

		for (int i = 0; i < this.index; i++) {
			temp += "\n" + this.shirts[i].toString();
		}
		return temp;
	}

}
