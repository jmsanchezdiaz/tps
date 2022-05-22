package ar.unq.poo2.tpAdapterAndTemplate.ej2;

public abstract class Empleado {
	private String nombre;
	private double sueldoBasico;
	private int horasTrabajadas;
	private int cantidadDeHijos;
	private EstadoCivil estadoCivil;
	
	
	public final double sueldo() {	
		double sueldoTotal = this.getSueldoBasico();
		double bonoFamiliar = this.calcularBonoFamiliar();
		double bonoPorHorasTrabajadas = this.calcularBonoPorHorasTrabajadas();
	
		sueldoTotal += bonoFamiliar + bonoPorHorasTrabajadas;
		
		return sueldoTotal - this.calcularRetenciones(sueldoTotal);
	}
	
	private double calcularRetenciones(double sueldoTotal) {
		return sueldoTotal * 0.13;
	}

	protected abstract double calcularBonoPorHorasTrabajadas();

	protected abstract double calcularBonoFamiliar();
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}
	
	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}
	
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}
