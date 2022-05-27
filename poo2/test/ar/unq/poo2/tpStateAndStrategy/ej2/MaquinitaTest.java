package ar.unq.poo2.tpStateAndStrategy.ej2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinitaTest {
	Maquinita maq;
	Pantalla pan;
	Ranura ran;
	State prendido;
	State apagado;
	
	@BeforeEach
	void setup() {
		prendido = mock(EstadoPrendido.class);
		apagado = mock(EstadoApagado.class);
		pan = new Pantalla();
		ran = new Ranura();
		maq = new Maquinita(pan, ran, apagado);
	}
	
	@Test
	void cuandoUnaMaquinitaSeInstanciaEstaApagada() {
		assertEquals(maq.getEstado(), apagado);
	}
	
	@Test
	void cuandoUnaMaquinitaEstaApagadaYSeTocaElBotonSePrende() {
		
		maq.tocarBotonDeInicio();
		verify(apagado).tocarBotonDeInicio();
	}
	
	@Test
	void cuandoUnaMaquinitaEstaPrendidaSePuedenIngresarFichas() {
		maq.setEstado(prendido);
		
		maq.ingresarFicha();
		
		verify(prendido).ingresarFicha();
	}
	
}
