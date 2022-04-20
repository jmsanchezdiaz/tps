package ar.unq.poo2.tp3.ej6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTest {
	Multioperador multi;
	List<Integer> numeros = new ArrayList<Integer>();
	@BeforeEach
	void setUp() {
		multi = new Multioperador();
		
		numeros.add(5);
		numeros.add(2);
		numeros.add(3);
		numeros.add(10);

	}
	
	@Test
	void testearSumaDeNumeros() {
		int resultado = multi.suma(numeros);
		
		assertEquals(resultado, 20); 
	}
	
	@Test
	void testearRestaDeNumeros() {
		int resultado = multi.resta(numeros);
		
		assertEquals(resultado, -20);
	}
	
	@Test
	void testearMultiplicacionDeNumeros() {
		int resultado = multi.multiplicacion(numeros);
		
		assertEquals(resultado, 300);
	}
}
