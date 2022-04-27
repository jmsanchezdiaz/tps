package ar.unq.poo2.tp5.ej1;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(String nombre, double costo, int stock) {
		super(nombre, costo, stock);
	}
	
	@Override
	public double getCosto() {
		return super.getCosto() * 0.9;
	}
}
