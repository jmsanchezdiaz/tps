package ar.unq.poo2.tp5.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaTest {
	private CajaDeMercado caja;
	private Producto arroz;
	private Producto cocacola;
	
	@BeforeEach
	void setUp() {
		caja = new CajaDeMercado();
		arroz = new Producto("Arroz", 34d, 10);
		cocacola = new ProductoCooperativa("CocaCola", 70d, 15);
	}
	
	@Test
	void cuandoUnaCajaSeInicializaSuMontoEs0() {
		assertEquals(caja.getMontoTotal(), 0d);
	}
	
	@Test
	void cuandoRegistroUnProductoSeActualizaElMontoYSuStockDecrementa() throws Exception {
		double montoEsperado = caja.getMontoTotal() + arroz.getCosto();
		int stockEsperado = arroz.getStock() - 1;
		
		caja.registrarPago(arroz);
		
		assertEquals(caja.getMontoTotal(), montoEsperado);
		assertEquals(arroz.getStock(), stockEsperado);
	}
	
	
	
}
