package ar.unq.poo2.tpComposite.ej5;

public class SpecialProduct extends Product {

	private int discount;
	
	public SpecialProduct(String name, float price, int discount) {
		super(name, price);
		this.setDiscount(discount);
	}

	@Override
	public float getPrice() {
		return super.getPrice() * this.calculatedDiscount();
	}

	private int calculatedDiscount() {
		return (this.getDiscount() / 100) - 1;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
