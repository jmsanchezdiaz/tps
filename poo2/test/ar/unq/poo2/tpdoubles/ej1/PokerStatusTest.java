package ar.unq.poo2.tpdoubles.ej1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	private PokerStatus pokerStatus;
	
	@BeforeEach
	void setUp() { 
		// Setup
		pokerStatus = new PokerStatus();
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsPoker() {
		String status = pokerStatus.verificar("10P","AC","AD","AT","AP"); // Exercise
	
		assertEquals(status , "Poker"); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsTrio() {
		String status = pokerStatus.verificar("10P","AC","10D","AT","10C"); // Exercise
	
		assertEquals(status , "Trio"); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsColor() {
		String status = pokerStatus.verificar("10P","AP","2P","4P","QP"); // Exercise
	
		assertEquals(status , "Color"); // Verify
	}
	
	@Test
	void puedoVerficarSiUnConjuntoDeCartasNoEsNada() {
		String status = pokerStatus.verificar("8T","5C","10D","AC","7P"); // Exercise
		
		assertEquals(status , ""); // Verify
	}
}
