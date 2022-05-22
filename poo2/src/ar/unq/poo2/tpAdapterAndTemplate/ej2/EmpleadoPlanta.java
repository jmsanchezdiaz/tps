package ar.unq.poo2.tpAdapterAndTemplate.ej2;

public class EmpleadoPlanta extends Empleado {

	public EmpleadoPlanta(String nombre, EstadoCivil estadoCivil, int cantHijos) {
		this.setNombre(nombre);
		this.setEstadoCivil(estadoCivil);
		this.setHorasTrabajadas(0);
		this.setSueldoBasico(3000);
		this.setCantidadDeHijos(cantHijos);
	}
	
	@Override
	protected double calcularBonoPorHorasTrabajadas() {
		return 0;
	}

	@Override
	protected double calcularBonoFamiliar() {
		return this.getCantidadDeHijos() * 150;
	}
	
}