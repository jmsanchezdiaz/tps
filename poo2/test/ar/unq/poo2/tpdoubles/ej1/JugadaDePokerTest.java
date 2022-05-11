package ar.unq.poo2.tpdoubles.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class JugadaDePokerTest {
	private JugadaDePoker jugada;
	private PokerStatusConCarta pokerStatus;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;


	
	@BeforeEach
	void setUp() {
		pokerStatus = new PokerStatusConCarta();
		jugada = new JugadaDePoker(pokerStatus);
	}
	
	@Test
	void unaManoConPokerLeGanaAOtraManoConColorTest() {
		carta1 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.PICAS);
		carta2 = new Carta(ValorDeCarta.A, ColorDeCarta.CORAZONES);
		carta3 = new Carta(ValorDeCarta.A, ColorDeCarta.TREBOLES);
		carta4 = new Carta(ValorDeCarta.A, ColorDeCarta.DIAMANTE);
		carta5 = new Carta(ValorDeCarta.A, ColorDeCarta.PICAS);
		carta6 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.PICAS);
		carta7 = new Carta(ValorDeCarta.A, ColorDeCarta.PICAS);
		carta8 = new Carta(ValorDeCarta.DOS, ColorDeCarta.PICAS);
		carta9 = new Carta(ValorDeCarta.TRES, ColorDeCarta.PICAS);
		carta10 = new Carta(ValorDeCarta.Q, ColorDeCarta.PICAS);
		
		List<Carta> poker = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<Carta> color = Arrays.asList(carta6,carta7,carta8,carta9,carta10);
		List<Carta> manoGanador = jugada.ganadorEntre(poker, color); // Exercise
		
		assertEquals(poker, manoGanador); // Verify
	}
	
	@Test
	void unaManoConPokerLeGanaAOtraManoConTrioTest() {
		carta1 = new Carta(ValorDeCarta.A, ColorDeCarta.DIAMANTE);
		carta2 = new Carta(ValorDeCarta.A, ColorDeCarta.DIAMANTE);
		carta3 = new Carta(ValorDeCarta.A, ColorDeCarta.PICAS);
		carta4 = new Carta(ValorDeCarta.A, ColorDeCarta.TREBOLES);
		carta5 = new Carta(ValorDeCarta.CINCO, ColorDeCarta.CORAZONES);
		carta6 = new Carta(ValorDeCarta.CUATRO, ColorDeCarta.DIAMANTE);
		carta7 = new Carta(ValorDeCarta.SIETE, ColorDeCarta.DIAMANTE);
		carta8 = new Carta(ValorDeCarta.SIETE, ColorDeCarta.CORAZONES);
		carta9 = new Carta(ValorDeCarta.SIETE, ColorDeCarta.PICAS);
		carta10 = new Carta(ValorDeCarta.A, ColorDeCarta.DIAMANTE);
	
		
		List<Carta> poker = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<Carta> trio = Arrays.asList(carta6,carta7,carta8,carta9,carta10);
		List<Carta> manoGanador = jugada.ganadorEntre(poker, trio); // Exercise
		
		assertEquals(poker, manoGanador); // Verify
	}
	
	@Test
	void unaManoConColorLeGanaAOtraManoConTrioTest() {
		carta1 = new Carta(ValorDeCarta.CUATRO, ColorDeCarta.DIAMANTE);
		carta2 = new Carta(ValorDeCarta.SIETE, ColorDeCarta.DIAMANTE);
		carta3 = new Carta(ValorDeCarta.SIETE, ColorDeCarta.CORAZONES);
		carta4 = new Carta(ValorDeCarta.SIETE, ColorDeCarta.PICAS);
		carta5 = new Carta(ValorDeCarta.A, ColorDeCarta.DIAMANTE);
		carta6 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.PICAS);
		carta7 = new Carta(ValorDeCarta.A, ColorDeCarta.PICAS);
		carta8 = new Carta(ValorDeCarta.DOS, ColorDeCarta.PICAS);
		carta9 = new Carta(ValorDeCarta.TRES, ColorDeCarta.PICAS);
		carta10 = new Carta(ValorDeCarta.Q, ColorDeCarta.PICAS);
		
		List<Carta> trio = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<Carta> color = Arrays.asList(carta6,carta7,carta8,carta9,carta10);
		List<Carta> manoGanador = jugada.ganadorEntre(color, trio); // Exercise
		
		assertEquals(color, manoGanador); // Verify
	}
	
	@Test
	void unaManoConColorLeGanaAOtraManoConColorSiSusCartasValenMasTest() {
		carta1 = new Carta(ValorDeCarta.DIEZ, ColorDeCarta.PICAS);
		carta2 = new Carta(ValorDeCarta.A, ColorDeCarta.PICAS);
		carta3 = new Carta(ValorDeCarta.DOS, ColorDeCarta.PICAS);
		carta4 = new Carta(ValorDeCarta.TRES, ColorDeCarta.PICAS);
		carta5 = new Carta(ValorDeCarta.Q, ColorDeCarta.PICAS);
		carta6 = new Carta(ValorDeCarta.CINCO, ColorDeCarta.PICAS);
		carta7 = new Carta(ValorDeCarta.A, ColorDeCarta.PICAS);
		carta8 = new Carta(ValorDeCarta.TRES, ColorDeCarta.PICAS);
		carta9 = new Carta(ValorDeCarta.TRES, ColorDeCarta.PICAS);
		carta10 = new Carta(ValorDeCarta.CUATRO, ColorDeCarta.PICAS);
		
		List<Carta> colorGanador = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<Carta> color = Arrays.asList(carta6,carta7,carta8,carta9,carta10);
		List<Carta> manoGanador = jugada.ganadorEntre(color, colorGanador); // Exercise
		
		assertEquals(colorGanador, manoGanador); // Verify
	}
}
