package ar.unq.poo2.tp5.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaTest {
	private CajaDeMercado caja;
	private Producto arroz;
	private Factura facturaDeServicio;
	private Factura facturaDeImpuesto;
	
	@BeforeEach
	void setUp() {
		caja = new CajaDeMercado();
		arroz = new Producto("Arroz", 34d, 10);
		facturaDeImpuesto = new FacturaDeImpuesto(50d, 15d);
		facturaDeServicio = new FacturaDeServicio(30d, 10d, 5);
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
	
	@Test
	void puedoRegistarProductosYFacturas() throws Exception {
		double montoEsperado = arroz.getCosto() + facturaDeImpuesto.getCosto() + facturaDeServicio.getCosto();
		int stockEsperado = arroz.getStock() - 1;
		
		caja.registrarPago(arroz);
		caja.registrarPago(facturaDeImpuesto);
		caja.registrarPago(facturaDeServicio);
		
		assertEquals(caja.getMontoTotal(), montoEsperado);
		assertEquals(arroz.getStock(), stockEsperado);
	}
	
	
	
}
