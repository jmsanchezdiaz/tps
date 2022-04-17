package ar.unq.poo2.tp3.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTest {
	Counter counter;
	
	@BeforeEach
	void setUp() {
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(2225);
		counter.addNumber(4);
	}
	
	@Test
	void testearNumeroPares() {
		int cantidad = counter.contarPares();
		
		assertEquals(cantidad, 1);
	}
	
	@Test
	void testearNumeroImpares() {
		int cantidad = counter.contarImpares();
		
		assertEquals(cantidad, 9);
	}
	
	@Test
	void testearNumeroMultiplo() {
		int cantidad = counter.contarMultiplo(3);
		
		assertEquals(cantidad, 2);
	}
	
	@Test
	void testearNumeroConMasDigitosPares() {
		int cantidad = counter.calcularMayorNumeroConDigitosPar();
		
		assertEquals(cantidad, 3);
	}
	
	@Test
	void testearMayorMultiploEntreMil() {
		assertEquals(counter.mayorMultiploEntreMil(3, 9), 999);
	}
}