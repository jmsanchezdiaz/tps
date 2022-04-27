package ar.unq.poo2.tp5.ej3;



public class Mascota implements Nombrable{
	private String name;
	private String raza;
	
	public Mascota(String name, String raza) {
		this.name = name;
		this.raza = raza;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.getName();
	}
}
