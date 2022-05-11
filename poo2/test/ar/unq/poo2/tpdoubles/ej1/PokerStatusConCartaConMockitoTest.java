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
	private Carta otraCarta1;
	private Carta otraCarta2;
	private Carta otraCarta3;
	private Carta otraCarta4;
	private Carta otraCarta5;

	@BeforeEach
	void setUp() { 
		// Setup
		this.pokerStatus = new PokerStatusConCarta();
		this.carta1 = mock(Carta.class);
		this.carta2 = mock(Carta.class);
		this.carta3 = mock(Carta.class);
		this.carta4 = mock(Carta.class);
		this.carta5 = mock(Carta.class);
		this.otraCarta1 = mock(Carta.class);
		this.otraCarta2 = mock(Carta.class);
		this.otraCarta3 = mock(Carta.class);
		this.otraCarta4 = mock(Carta.class);
		this.otraCarta5 = mock(Carta.class);
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsPoker() {
		//Set up
		when(carta1.getValor()).thenReturn(ValorDeCarta.DIEZ);
		when(carta2.getValor()).thenReturn(ValorDeCarta.A);
		when(carta3.getValor()).thenReturn(ValorDeCarta.A);
		when(carta4.getValor()).thenReturn(ValorDeCarta.A);
		when(carta5.getValor()).thenReturn(ValorDeCarta.A);
		PokerValues status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
		assertEquals(status , PokerValues.POKER); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsTrio() {
		//Set up
		when(carta1.getValor()).thenReturn(ValorDeCarta.DIEZ);
		when(carta2.getValor()).thenReturn(ValorDeCarta.A);
		when(carta3.getValor()).thenReturn(ValorDeCarta.DIEZ);
		when(carta4.getValor()).thenReturn(ValorDeCarta.A);
		when(carta5.getValor()).thenReturn(ValorDeCarta.DIEZ);

		PokerValues status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
		
		assertEquals(status , PokerValues.TRIO); // Verify
	}
	
	@Test
	void puedoVerificarSiUnConjuntoDeCartasEsColor() {
		//Set up
		when(carta1.getValor()).thenReturn(ValorDeCarta.DIEZ);
		when(carta2.getValor()).thenReturn(ValorDeCarta.A);
		when(carta3.getValor()).thenReturn(ValorDeCarta.TRES);
		when(carta4.getValor()).thenReturn(ValorDeCarta.CUATRO);
		when(carta5.getValor()).thenReturn(ValorDeCarta.SEIS);
		when(carta1.getPalo()).thenReturn(ColorDeCarta.DIAMANTE);
		when(carta2.getPalo()).thenReturn(ColorDeCarta.DIAMANTE);
		when(carta3.getPalo()).thenReturn(ColorDeCarta.DIAMANTE);
		when(carta4.getPalo()).thenReturn(ColorDeCarta.DIAMANTE);
		when(carta5.getPalo()).thenReturn(ColorDeCarta.DIAMANTE);
		
		assertEquals(pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)) , "Color"); // Verify
	}
	
	@Test
	void puedoVerficarSiUnConjuntoDeCartasNoEsNada() {
		//Set up
		when(carta1.getValor()).thenReturn(ValorDeCarta.DIEZ);
		when(carta1.getPalo()).thenReturn(ColorDeCarta.PICAS);
		when(carta2.getValor()).thenReturn(ValorDeCarta.A);
		when(carta2.getPalo()).thenReturn(ColorDeCarta.CORAZONES);
		when(carta3.getValor()).thenReturn(ValorDeCarta.SEIS);
		when(carta3.getPalo()).thenReturn(ColorDeCarta.TREBOLES);
		when(carta4.getValor()).thenReturn(ValorDeCarta.TRES);
		when(carta4.getPalo()).thenReturn(ColorDeCarta.DIAMANTE);
		when(carta5.getValor()).thenReturn(ValorDeCarta.DIEZ);
		when(carta5.getPalo()).thenReturn(ColorDeCarta.CORAZONES);
		PokerValues status = pokerStatus.verificar(Arrays.asList(carta1,carta2,carta3,carta4,carta5)); // Exercise
		
		assertEquals(status , PokerValues.NOTHING); // Verify
	}
}
