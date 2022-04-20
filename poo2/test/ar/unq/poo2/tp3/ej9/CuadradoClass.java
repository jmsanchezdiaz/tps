package ar.unq.poo2.tp3.ej9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.poo2.tp3.ej8.Point;

public class CuadradoClass {
	private Cuadrado cuadrado;
	
	@BeforeEach
	void setUp() {
		cuadrado = new Cuadrado(new Point(10,10), 10);
	}
	
	@Test
	void puedoCrearUnCuadrado() {
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda(), new Point(10,10));
		assertEquals(cuadrado.getEsquinaSuperiorDerecha(), new Point(20,10));
		assertEquals(cuadrado.getEsquinaInferiorIzquierda(), new Point(10,0));
		assertEquals(cuadrado.getEsquinaInferiorDerecha(), new Point(20,0));
	}
	
	@Test
	void puedoCalcularElAreaDelCuadrado() {
		assertEquals(cuadrado.calcularArea(), 100);
	}
	
	@Test
	void puedoCalcularElPerimetroDelCuadrado() {
		assertEquals(cuadrado.calcularPerimetro(), 40);
	}
}
