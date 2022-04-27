package ar.unq.poo2.tp5.ej1;

public class Producto implements Facturable{
	private int stock;
	private String nombre;
	private double costo;
	
	public Producto(String nombre, double costo, int stock) {
		this.nombre = nombre;
		this.setCosto(costo);
		this.setStock(stock);
	}

	public double getCosto() {
		return costo;
	}

	public void registrar() throws Exception {
		this.decrementarStock();
	}
	
	private void setCosto(double costo) {
		this.costo = costo;
	}

	public int getStock() {
		return stock;
	}

	public void decrementarStock() throws Exception {
		if(this.getStock() <= 0) throw new Exception("No puede haber un stock negativo");
		
		setStock(this.getStock() - 1);	
	}
	
	private void setStock(int stock) {
		this.stock = stock;
	}

}
