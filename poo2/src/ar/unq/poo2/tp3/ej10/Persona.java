package ar.unq.poo2.tp3.ej10;

import java.time.LocalDate;

/*
 * 1) El objeto que le envia el mensaje no conoce como se calcula la misma. Este metodo de abstracción se
 * llama encapsulamiento.
 */


public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public boolean esMenorQue(Persona otraPersona) {
		return this.edad() < otraPersona.edad();
	}
	
	public int edad() {
		LocalDate today = LocalDate.now();
		int edadPosible = today.getYear() - fechaNacimiento.getYear();
		if(today.getMonthValue() < fechaNacimiento.getMonthValue()) {
			edadPosible--;
		}
		return edadPosible;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
}
