package ar.unq.poo2.tpAdapterAndTemplate.ej2;

public class EmpleadoTemporario extends Empleado {
	private EstadoCivil estadoCivil;
	private int cantHijos;
	private double sueldoBasico;
	private int horasTrabajadas;
	
	public EmpleadoTemporario(EstadoCivil estadoCivil, int cantHijos, double sueldoBasico) {
		this.setEstadoCivil(estadoCivil);
		this.setCantidadDeHijos(cantHijos);
		this.setSueldoBasico(sueldoBasico);
	}
	
	private void setSueldoBasico(double sueldoBasico2) {
		this.sueldoBasico = sueldoBasico2;
	}

	@Override
	protected double calcularBonoPorHorasTrabajadas() {
		return this.getHorasTrabajadas() * 5;
	}

	@Override
	protected double calcularBonoFamiliar() {
		if(EstadoCivil.CASADO == this.getEstadoCivil() || this.getCantidadDeHijos() > 0) {
			return 100;
		}
		return 0;
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

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

}
