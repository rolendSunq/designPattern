package command.part1;

public class Stock {
	private String name;
	private int quantity;

	public Stock() {
		name = "ABC";
		quantity = 10;
	}

	public Stock(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public void sell() {
		System.out.println("Stock [name: " + name + " Quantity: " + quantity + " ] ÆÈ¾Ò´Ù.");
	}

	public void buy() {
		System.out.println("Stock [name: " + name + " Quantity: " + quantity + " ] »ò´Ù.");
	}
}
