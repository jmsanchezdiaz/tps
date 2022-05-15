package ar.unq.poo2.tpComposite.ej5;

import java.util.List;

public class CarritoDeCompras {
	private List<Product> elements;

	public List<Product> getElements() {
		return elements;
	}

	public void setElements(List<Product> elements) {
		this.elements = elements;
	}
	
	public float total() {
		float total = 0;
		
		for(Product product : this.getElements()) {
			total += product.getPrice();
		}
		
		return total;
	}
	
	public int totalRounded() {
		int	total = 0;
		
		for(Product product : this.getElements()) {
			total += Math.round(product.getPrice());
		}
		
		return total;
	}
}
