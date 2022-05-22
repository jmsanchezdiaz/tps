package ar.unq.poo2.tpAdapterAndTemplate.ej2;

public class Pasante extends Empleado {
	private int cantidadDeHorasTrabajadas;
	
	public Pasante(int cantHorasTrabajadas) {
		this.setCantidadDeHorasTrabajadas(cantHorasTrabajadas);

	}
	
	@Override
	protected double calcularBonoPorHorasTrabajadas() {
		return this.getCantidadDeHorasTrabajadas() * 40;
	}

	@Override
	protected double calcularBonoFamiliar() {
		return 0;
	}

	public int getCantidadDeHorasTrabajadas() {
		return cantidadDeHorasTrabajadas;
	}

	public void setCantidadDeHorasTrabajadas(int cantidadDeHorasTrabajadas) {
		this.cantidadDeHorasTrabajadas = cantidadDeHorasTrabajadas;
	}

	@Override
	protected double getSueldoBasico() {
		return 0;
	}

}