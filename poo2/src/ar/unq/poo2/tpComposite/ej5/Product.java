package ar.unq.poo2.tpComposite.ej5;

public class Product {
	private float price;
	private String name;
	
	public Product(String name, float price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
}
