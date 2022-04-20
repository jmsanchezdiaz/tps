package ar.unq.poo2.tp3.ej11;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Persona> getIntegrantes(){
		return this.integrantes;
	}
	
	public double calcularEdadPromedio() {
		double average = 0;
		for(Persona integrante : this.getIntegrantes()) {
			double edadDeIntegrante = integrante.getEdad();
			average += (edadDeIntegrante / this.cantidadDeIntegrantes());
		}
		return average;
	}

	public int cantidadDeIntegrantes() {
		return this.getIntegrantes().size();
	}

	public void contratarA(Persona otroIntegrante) {
		this.getIntegrantes().add(otroIntegrante);
	}
}
