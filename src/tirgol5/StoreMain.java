package tirgol5;

public class StoreMain {

	public static void main(String[] args) {
		Store st1 = new Store("cat shop", "rotshiled 45,yokneam");
		Shirt s1 = new Shirt("black", "nike", "XXL");
		Shirt s2 = new Shirt("white", "adidas", "XS");
		Pants p1 = new Pants("red", "crocs", 50);
		Pants p2 = new Pants("yellow", "carolina lemka", 25);
		// add date to store
		st1.addPants(p1);
		st1.addPants(p2);
		//
		st1.addShirt(s1);
		st1.addShirt(s2);
		System.out.println(st1);

	}

}
