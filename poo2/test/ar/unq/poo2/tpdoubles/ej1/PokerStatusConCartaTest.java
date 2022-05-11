package ar.unq.poo2.tpdoubles.ej1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
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
		carta1 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.PICAS);
		carta2 = new Carta(ValorDeCarta.A, ColorDeCarta.CORAZONES);
		carta3 = new Carta(ValorDeCarta.A, ColorDeCarta.TREBOLES);
		carta4 = new Carta(ValorDeCarta.A, ColorDeCarta.DIAMANTE);
		carta5 = new Carta(ValorDeCarta.A, ColorDeCarta.PICAS);
		PokerValues status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
	
		assertEquals(status , PokerValues.POKER); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsTrio() {
		//Set up
		carta1 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.PICAS);
		carta2 = new Carta(ValorDeCarta.A, ColorDeCarta.CORAZONES);
		carta3 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.TREBOLES);
		carta4 = new Carta(ValorDeCarta.A, ColorDeCarta.DIAMANTE);
		carta5 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.PICAS);
		PokerValues status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
	
		assertEquals(status , PokerValues.TRIO); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsColor() {
		//Set up
		carta1 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.PICAS);
		carta2 = new Carta(ValorDeCarta.TRES, ColorDeCarta.PICAS);
		carta3 = new Carta(ValorDeCarta.A, ColorDeCarta.PICAS);
		carta4 = new Carta(ValorDeCarta.DOS, ColorDeCarta.PICAS);
		carta5 = new Carta(ValorDeCarta.A, ColorDeCarta.PICAS);
		PokerValues status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
	
		assertEquals(status , PokerValues.COLOR); // Verify
	}
	
	@Test
	void puedoVerficarSiUnConjuntoDeCartasNoEsNada() {
		//Set up
		carta1 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.PICAS);
		carta2 = new Carta(ValorDeCarta.A, ColorDeCarta.CORAZONES);
		carta3 = new Carta(ValorDeCarta.DOS, ColorDeCarta.TREBOLES);
		carta4 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.DIAMANTE);
		carta5 = new Carta(ValorDeCarta.Q, ColorDeCarta.PICAS);

		PokerValues status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
		
		assertEquals(status , PokerValues.NOTHING); // Verify
	}
	
}
