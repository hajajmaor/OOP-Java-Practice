package tirgol4;

public class ClothingItem {
	// שגיאות כתיב בשם המחלקה לפנות לאליאורה
	private String size;
	private String color;
	private String brand;

	public ClothingItem(String size, String color, String brand) {
		// this.brand = brand;
		this.setBrand(brand);
		// this.color = color;
		this.setColor(color);
		// this.size = size;
		this.setSize(size);
	}

	public void setSize(String size) {
		size = size.replace("-", "");
		this.size = size;
	}

	public void setColor(String color) {
		String[] colors = { "red", "blue", "green", "black", "yellow" };
		boolean inArray = false;
		color = color.toLowerCase();

		// בוטלה לצורך דוגמה
		// for (String colorFromArray : colors) {
		// if (color.equals(colorFromArray)) {
		// inArray = true;
		// break;
		// }
		// }

		for (int i = 0; i < colors.length; i++) {
			if (color.equals(colors[i])) {
				inArray = true;
				break;
			}
		}
		if (inArray == true) {
			this.color = color;
		} else {
			this.color = colors[0];
		}
	}

	public void setBrand(String brand) {
		String[] brands = { "nike", "adidas", "replay", "vans", "mania" };
		boolean inArray = false;
		brand = brand.toLowerCase();
		for (String brandFromArray : brands) {
			if (brandFromArray.equals(brand)) {
				inArray = true;
				break;
			}
		}
		if (inArray == true)
			this.brand = brand;
		else
			this.brand = brands[0];
	}

	public String getSize() {
		return this.size;
	}

	public String getColor() {
		return this.color;
	}

	public String getBrand() {
		return this.brand;
	}

	public boolean equals(ClothingItem other) {
		if (this.size.equals(other.size) && this.brand.equals(other.brand) && this.color.equals(other.color)) {
			return true;
		}
		return false;
	}

	public String toString() {
		return new String("ClothingItem [size=\n" + size + ", color=" + color + ", brand=" + brand + "]");
	}

}
