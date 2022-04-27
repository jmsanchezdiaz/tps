package ar.unq.poo2.tp5.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductoCooperativaTest {
	
	@Test
	void puedoSaberElPrecioConDescuentoDeIVA() {
		ProductoCooperativa cocacola = new ProductoCooperativa("CocaCola", 70d, 15);
		double precioEsperado = 70d * 0.9;
		assertEquals(cocacola.getCosto(), precioEsperado);
	}
}
