package ar.unq.poo2.tp4.ej3;

public class Ingreso {
	private String mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	public Ingreso(String mesDePercepcion, String concepto, double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public double getMontoPercibido() {		
		return this.montoPercibido;
	}
	
	public double getImpuesto() {
		return this.getMontoPercibido() * 0.02;
	}
	
	public double getMontoImponible() {
		return this.getMontoPercibido() + this.getImpuesto();
	}

}
