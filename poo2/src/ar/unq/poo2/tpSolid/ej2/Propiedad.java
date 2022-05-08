package ar.unq.poo2.tpSolid.ej2;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public Propiedad(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}
}
