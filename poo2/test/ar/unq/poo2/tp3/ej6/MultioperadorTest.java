package ar.unq.poo2.tp3.ej6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTest {
	Multioperador multi;
	
	@BeforeEach
	void setUp() {
		multi = new Multioperador();
		
		multi.addNumber(5);
		multi.addNumber(2);
		multi.addNumber(3);
		multi.addNumber(10);

	}
	
	@Test
	void testearSumaDeNumeros() {
		int resultado = multi.suma();
		
		assertEquals(resultado, 20); 
	}
	
	@Test
	void testearRestaDeNumeros() {
		int resultado = multi.resta();
		
		assertEquals(resultado, -20);
	}
	
	@Test
	void testearMultiplicacionDeNumeros() {
		int resultado = multi.multiplicacion();
		
		assertEquals(resultado, 300);
	}
}
