package ar.unq.poo2.tpdoubles.ej1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PokerStatusConCartaConMockitoTest {
	private PokerStatusConCarta pokerStatus;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;

	@BeforeEach
	void setUp() { 
		// Setup
		this.pokerStatus = new PokerStatusConCarta();
		this.carta1 = mock(Carta.class);
		this.carta2 = mock(Carta.class);
		this.carta3 = mock(Carta.class);
		this.carta4 = mock(Carta.class);
		this.carta5 = mock(Carta.class);
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsPoker() {
		//Set up
		when(carta1.getValor()).thenReturn("10");
		when(carta2.getValor()).thenReturn("A");
		when(carta3.getValor()).thenReturn("A");
		when(carta4.getValor()).thenReturn("A");
		when(carta5.getValor()).thenReturn("A");
		String status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
		assertEquals(status , "Poker"); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsTrio() {
		//Set up
		when(carta1.getValor()).thenReturn("10");
		when(carta2.getValor()).thenReturn("A");
		when(carta3.getValor()).thenReturn("10");
		when(carta4.getValor()).thenReturn("A");
		when(carta5.getValor()).thenReturn("10");

		String status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
		
		assertEquals(status , "Trio"); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsColor() {
		//Set up
		when(carta1.getValor()).thenReturn("10");
		when(carta2.getValor()).thenReturn("A");
		when(carta3.getValor()).thenReturn("3");
		when(carta4.getValor()).thenReturn("4");
		when(carta5.getValor()).thenReturn("6");
		when(carta1.getPalo()).thenReturn("D");
		when(carta2.getPalo()).thenReturn("D");
		when(carta3.getPalo()).thenReturn("D");
		when(carta4.getPalo()).thenReturn("D");
		when(carta5.getPalo()).thenReturn("D");
		
		assertEquals(pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)) , "Color"); // Verify
	}
	
	@Test
	void puedoVerficarSiUnConjuntoDeCartasNoEsNada() {
		//Set up
		when(carta1.getValor()).thenReturn("10");
		when(carta1.getPalo()).thenReturn("P");
		when(carta2.getValor()).thenReturn("A");
		when(carta2.getPalo()).thenReturn("C");
		when(carta3.getValor()).thenReturn("6");
		when(carta3.getPalo()).thenReturn("T");
		when(carta4.getValor()).thenReturn("3");
		when(carta4.getPalo()).thenReturn("D");
		when(carta5.getValor()).thenReturn("10");
		when(carta5.getPalo()).thenReturn("C");
		String status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
		
		assertEquals(status , ""); // Verify
	}
	
	
	
}
