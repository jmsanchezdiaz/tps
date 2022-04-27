package ar.unq.poo2.tp5.ej1;

public class Factura implements Facturable{
	private double costo;
	
	public Factura(double costo) {
		this.costo = costo;
	}
	
	public double getCosto() {
		return this.costo;
	}

	public void registrar() throws Exception {
		
	}
}
