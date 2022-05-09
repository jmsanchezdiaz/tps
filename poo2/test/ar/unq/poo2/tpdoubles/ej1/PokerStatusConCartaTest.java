package ar.unq.poo2.tpdoubles.ej1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PokerStatusConCartaTest {
	private PokerStatusConCarta pokerStatus;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;

	@BeforeEach
	void setUp() { 
		// Setup
		pokerStatus = new PokerStatusConCarta();
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsPoker() {
		//Set up
		carta1 = new Carta("10", "P");
		carta2 = new Carta("A", "C");
		carta3 = new Carta("A", "T");
		carta4 = new Carta("A", "D");
		carta5 = new Carta("A", "P");
		String status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
	
		assertEquals(status , "Poker"); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsTrio() {
		//Set up
		carta1 = new Carta("10", "P");
		carta2 = new Carta("A", "C");
		carta3 = new Carta("10", "T");
		carta4 = new Carta("A", "D");
		carta5 = new Carta("10", "D");
		String status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
	
		assertEquals(status , "Trio"); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsColor() {
		//Set up
		carta1 = new Carta("10", "P");
		carta2 = new Carta("A", "P");
		carta3 = new Carta("2", "P");
		carta4 = new Carta("4", "P");
		carta5 = new Carta("Q", "P");
		String status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
	
		assertEquals(status , "Color"); // Verify
	}
	
	@Test
	void puedoVerficarSiUnConjuntoDeCartasNoEsNada() {
		//Set up
		carta1 = new Carta("10", "P");
		carta2 = new Carta("A", "C");
		carta3 = new Carta("2", "T");
		carta4 = new Carta("10", "D");
		carta5 = new Carta("Q", "P");
		String status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
		
		assertEquals(status , ""); // Verify
	}
	
	@Test
	void puedoSaberSiUnaCartaEsMayorQueOtra() {
		//Set up
		carta1 = new Carta("10", "P");
		carta2 = new Carta("A", "C");
		
		assertTrue(carta1.isGreaterThan(carta2)); // Verify
	}
	
	@Test
	void puedoSaberSiUnaCartaNoEsMayorQueOtra() {
		//Set up
		carta1 = new Carta("10", "P");
		carta2 = new Carta("A", "C");
		
		assertTrue(carta2.isGreaterThan(carta1)); // Verify
	}
}
