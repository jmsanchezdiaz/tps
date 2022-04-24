package ar.unq.poo2.tp4.ej3;

public class IngresoPorHorasExtra extends Ingreso {
	private int cantidadHorasExtras;
	
	public IngresoPorHorasExtra(String mesDePercepcion, String concepto, double montoPercibido, int cantidadDeHorasExtras) {
		super(mesDePercepcion, concepto,montoPercibido);
		this.cantidadHorasExtras = cantidadDeHorasExtras;
	}
	
	@Override
	public double getImpuesto() {
		return 0;
	}
}
