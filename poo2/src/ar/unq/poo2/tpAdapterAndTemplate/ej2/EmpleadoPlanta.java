package ar.unq.poo2.tpAdapterAndTemplate.ej2;

public class EmpleadoPlanta extends Empleado {

	private EstadoCivil estadoCivil;
	private int cantHijos;
	private double sueldoBasico;
	
	public EmpleadoPlanta(EstadoCivil estadoCivil, int cantHijos, double sueldoBasico) {
		this.setEstadoCivil(estadoCivil);
		this.setCantidadDeHijos(cantHijos);
		this.setSueldoBasico(sueldoBasico);
	}
	
	private void setSueldoBasico(double sueldoBasico2) {
		this.sueldoBasico = sueldoBasico2;
	}

	@Override
	protected double calcularBonoPorHorasTrabajadas() {
		return 0;
	}

	@Override
	protected double calcularBonoFamiliar() {
		return this.getCantidadDeHijos() * 150;
	}

	private void setCantidadDeHijos(int cant) {
		this.cantHijos = cant;
	}	
	
	private int getCantidadDeHijos() {
		return this.cantHijos;
	}

	@Override
	protected double getSueldoBasico() {
		return this.sueldoBasico;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}