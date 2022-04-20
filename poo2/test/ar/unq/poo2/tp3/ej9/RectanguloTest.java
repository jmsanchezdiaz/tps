package ar.unq.poo2.tp3.ej9;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.poo2.tp3.ej8.Point;

public class RectanguloTest {
	private Rectangulo rectangulo;
	
	@BeforeEach
	void setUp() {
		rectangulo = new Rectangulo(new Point(10, 15), 10, 15);
	}
	
	@Test
	void puedoCrearUnRectanguloAdecuado() {
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda(), new Point(10, 15));
		assertEquals(rectangulo.getEsquinaSuperiorDerecha(), new Point(25, 15));
		assertEquals(rectangulo.getEsquinaInferiorDerecha(), new Point(25, 5));
		assertEquals(rectangulo.getEsquinaInferiorIzquierda(), new Point(10, 5));
	}
	
	@Test
	void puedoCalcularElArea() {
		assertEquals(rectangulo.calcularArea(), 150);
	}
	
	@Test
	void puedoCalcularElPerimetro() {
		assertEquals(rectangulo.calcularPerimetro(), 50);
	}
	
	@Test
	void puedoSaberSiEsUnRectanguloVertical() {
		assertFalse(rectangulo.esVertical());
	}
	
	@Test
	void puedoSaberSiEsUnRectanguloHorizontal() {
		assertTrue(rectangulo.esHorizontal());
	}
}
