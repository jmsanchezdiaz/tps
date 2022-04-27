package ar.unq.poo2.tp5.ej3;

import java.time.LocalDate;


public class Persona implements Nombrable{
	private String name;
	private LocalDate fechaNac;
	
	public Persona(String name, LocalDate fechaNac) {
		this.name = name;
		this.fechaNac = fechaNac;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int edad() {
		LocalDate today = LocalDate.now();
		int edad = fechaNac.getYear() - today.getYear();
		if(fechaNac.getDayOfYear() > today.getDayOfYear()) {
			edad--;
		}
		return edad;
	}
	
	public String toString() {
		return this.getName();
	}
}
