package ar.unq.poo2.tp3.ej11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTest {
	private EquipoDeTrabajo equipo;
	private Persona juan;
	private Persona kent;
	private Persona daniel;
	private Persona richard;
	private Persona michael;
	
	@BeforeEach
	void setUp() {
		equipo = new EquipoDeTrabajo("Java dev team");
		juan = new Persona("Juan", "Sanchez Diaz", 19);
		kent = new Persona("Kent", "Odds", 28);
		daniel = new Persona("Daniel", "Larusso", 34);
		richard = new Persona("Richard", "Madden", 24);
		michael = new Persona("Michael", "Jackson", 50);

		equipo.contratarA(juan);
		equipo.contratarA(kent);
		equipo.contratarA(richard);
		equipo.contratarA(michael);
		equipo.contratarA(daniel);
	}
	
	@Test
	void puedoSaberElNombreDelEquipo() {
		assertEquals(equipo.getNombre(), "Java dev team");
	}
	
	@Test
	void puedoCalcularElPromedioDeEdadDelEquipo() {
		double sumatoriaDeEdades= juan.getEdad() + kent.getEdad() + richard.getEdad() + michael.getEdad() + daniel.getEdad();
		double promedioEsperado = sumatoriaDeEdades / equipo.cantidadDeIntegrantes();
		assertEquals(equipo.calcularEdadPromedio(), promedioEsperado);
	}
	
	@Test
	void punto5() {
		System.out.print("Edad promedio:" + equipo.calcularEdadPromedio());
	}
}
