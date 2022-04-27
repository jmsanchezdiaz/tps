package ar.unq.poo2.tp5.ej1;

public class FacturaDeServicio extends Factura {
	private int unidadesConsumidas;
	private double valorPorUnidad;
	
	public FacturaDeServicio(double costo, double valorPorUnidad, int unidadesConsumidas) {
		super(costo);
		this.unidadesConsumidas = unidadesConsumidas;
		this.valorPorUnidad = valorPorUnidad;
	}
	
	@Override
	public double getCosto() {
		return super.getCosto() + (this.getUnidadesConsumidas() + this.getValorPorUnidad());
	}

	private double getValorPorUnidad() {
		return this.valorPorUnidad;
	}

	private int getUnidadesConsumidas() {
		return this.unidadesConsumidas;
	}
}
