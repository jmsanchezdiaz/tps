package ar.unq.poo2.tpAdapterAndTemplate.ej2;

public class Pasante extends Empleado {

	public Pasante(String nombre, EstadoCivil estadoCivil, int cantHijos, int cantHorasTrabajadas) {
		this.setNombre(nombre);
		this.setEstadoCivil(estadoCivil);
		this.setHorasTrabajadas(cantHorasTrabajadas);
		this.setSueldoBasico(0);
		this.setCantidadDeHijos(cantHorasTrabajadas);
	}
	
	@Override
	protected double calcularBonoPorHorasTrabajadas() {
		return this.getHorasTrabajadas() * 40;
	}

	@Override
	protected double calcularBonoFamiliar() {
		return 0;
	}

}