package ar.unq.poo2.tp4.ej3;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	public Trabajador(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public List<Ingreso> getIngresos(){
		return this.ingresos;
	}
	
	public void agregarIngreso(Ingreso newIngreso) {
		this.getIngresos().add(newIngreso);
	}
	
	public double getTotalPercibido() {
		double total = 0;
		for(Ingreso ingreso : this.getIngresos()) {
			total += ingreso.getMontoPercibido();
		}
		
		//this.getIngresos().stream().mapToDouble(Ingreso::getMontoPercibido).sum();
		return total;
	}
	
	public double getImpuestoAPagar() {
		double total = 0;
		for(Ingreso ingreso : this.getIngresos()) {
			total += ingreso.getImpuesto();
		}
		
		return total;
	}
	
	public double getMontoImponible() {
		double total = 0;
		for(Ingreso ingreso : this.getIngresos()) {
			total += ingreso.getMontoImponible();
		}
		

		return total;
	}
}
