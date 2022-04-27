package ar.unq.poo2.tp5.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
	private Producto arroz;
	
	@BeforeEach
	void setUp() {
		arroz = new Producto("Arroz", 34d, 2);
	}
	
	@Test
	void puedoSaberElPrecioDeUnProducto() {
		assertEquals(arroz.getCosto(), 34d);
	}
	
	@Test
	void puedoSaberElStockDeUnProducto() {
		assertEquals(arroz.getStock(), 2);
	}
	
	@Test
	void puedoDecrementarElStockDeUnProducto() throws Exception {
		arroz.decrementarStock();
		assertEquals(arroz.getStock(), 1);
	}
	
	@Test
	void noPuedoDecrementarElStockDeUnProductoSiEsMenorQue1() {
		try {
			arroz.decrementarStock();
			arroz.decrementarStock();
		} catch (Exception e) {
			assertEquals(e.getMessage(), "No puede haber un stock negativo");
			assertEquals(arroz.getStock(), 0);
		}
	}
}
