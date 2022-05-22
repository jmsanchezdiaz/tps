package ar.unq.poo2.tpAdapterAndTemplate.ej2;

public class EmpleadoTemporario extends Empleado {

	
	public EmpleadoTemporario(String nombre, EstadoCivil estadoCivil, int cantHijos, int cantHorasTrabajadas) {
		this.setNombre(nombre);
		this.setEstadoCivil(estadoCivil);
		this.setHorasTrabajadas(cantHorasTrabajadas);
		this.setSueldoBasico(1000);
		this.setCantidadDeHijos(cantHijos);
	}
	
	@Override
	protected double calcularBonoPorHorasTrabajadas() {
		return this.getHorasTrabajadas() * 5;
	}

	@Override
	protected double calcularBonoFamiliar() {
		if(this.getEstadoCivil() == EstadoCivil.CASADO || this.getCantidadDeHijos() > 0) {
			return 100;
		}
		
		return 0;
	}
	
	

}
