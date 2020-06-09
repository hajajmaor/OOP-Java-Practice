package tirgol5;

public class Shirt extends ClothingItem {
	private String size;

	public Shirt(String color, String brand, String size) {
		super(color, brand);
		setSize(size);
	}

	public void setSize(String size) {
		size = size.replace("-", "");
		this.size = size;
	}

	public String getSize() {
		return this.size;
	}

	public String toString() {
		return "Shirt details:" + super.toString() + ", size: " + this.size;
	}
}
