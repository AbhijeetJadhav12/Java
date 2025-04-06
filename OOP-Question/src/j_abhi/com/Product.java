package j_abhi.com;

public class Product {
	private int pId;
	private String name;
	private int price;
	private int quantity;

	public Product() {

	}

	public Product(int pId, String name, int price, int quantity) {
		this.pId = pId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
