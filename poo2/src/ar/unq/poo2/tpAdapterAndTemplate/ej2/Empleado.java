package ar.unq.poo2.tpAdapterAndTemplate.ej2;

public abstract class Empleado {
	// Template Method
	public final double sueldo() {	
		double sueldoTotal = this.getSueldoBasico(); // Native
		double bonoFamiliar = this.calcularBonoFamiliar(); // Native
		double bonoPorHorasTrabajadas = this.calcularBonoPorHorasTrabajadas(); // Native
	
		sueldoTotal += bonoFamiliar + bonoPorHorasTrabajadas;
		
		return sueldoTotal - this.calcularRetenciones(sueldoTotal); // Concrete
	}
	
	protected abstract double getSueldoBasico();

	private double calcularRetenciones(double sueldoTotal) {
		return sueldoTotal * 0.13;
	}

	protected abstract double calcularBonoPorHorasTrabajadas();

	protected abstract double calcularBonoFamiliar();

}
