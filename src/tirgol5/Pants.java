package tirgol5;

public class Pants extends ClothingItem {
	private int size;

	public Pants(String color, String brand, int size) {
		super(color, brand);
		setSize(size);
	}

	public void setSize(int size) {
//		size = size.replace("-", ""); s-mall
		if (size < 20 || size > 80) {
			System.out.println("set size got value above 80 or under 20");
			this.size = 34;
		} else
			this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	public String toString() {
		return "Pants details: " + super.toString() + ", size: " + this.size;
	}
}
