package tirgol5;

import java.util.LinkedList;

public class Store {
	private String name, address;
	private LinkedList<Shirt> shirts;
	private LinkedList<Pants> pants;

	public Store(String name, String address) {
		this.address = address;
		this.name = name;
		this.shirts = new LinkedList<Shirt>();
		this.pants = new LinkedList<Pants>();
	}

	public void addPants(Pants p) {
		this.pants.add(p);
	}

	public void addShirt(Shirt s) {
		this.shirts.add(s);
	}

	public String toString() {
		String str = "the store is:\nname: " + this.name + ", address: " + this.address + "\nShirts inventory:\n";
		for (int i = 0; i < this.shirts.size(); i++) {
			str += this.shirts.get(i).toString() + "\n";
		}
		str += "\npants inventory: \n";
		for (int i = 0; i < this.pants.size(); i++) {
			str += this.pants.get(i).toString() + "\n";
		}
		return str;
	}
}
