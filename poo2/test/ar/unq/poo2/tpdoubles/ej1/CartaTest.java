package ar.unq.poo2.tpdoubles.ej1;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartaTest {
	Carta card;
	
	@BeforeEach
	void setup() {
		card = new Carta("Q", "D");
	}
	
	@Test
	void puedoSaberSiUnaCartaEsMayorQueOtra() {
		//Set up
		Carta card2 = new Carta("10", "P");
		
		assertTrue(card.isGreaterThan(card2)); // Verify
	}
	
	
}
