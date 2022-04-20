package ar.unq.poo2.tp3.ej10;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	private Persona unaPersona;
	private Persona otraPersona;
	
	@BeforeEach
	void setUp() {
		unaPersona = new Persona("Juan manuel", LocalDate.of(2002, 5, 11));
		otraPersona = new Persona("Ezequiel", LocalDate.of(2001, 4, 20));
	}
	
	@Test
	void puedoSaberLaEdadDeUnaPersona() {
		assertEquals(unaPersona.edad(), 19);
	}
	
	@Test
	void puedoSaberSiUnaPersonaEsMenorQueOtra(){
		assertTrue(unaPersona.esMenorQue(otraPersona));
	}
}
