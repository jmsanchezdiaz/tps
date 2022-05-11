package ar.unq.poo2.tpdoubles.ej1;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartaTest {
	Carta card;
	
	@BeforeEach
	void setup() {
		card = new Carta(ValorDeCarta.Q, ColorDeCarta.DIAMANTE);
	}
	
	@Test
	void puedoSaberSiUnaCartaEsMayorQueOtra() {
		//Set up
		Carta card2 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.TREBOLES);
		
		assertTrue(card.isGreaterThan(card2)); // Verify
	}
	
	
}
