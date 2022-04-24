package ar.unq.poo2.tp4.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	private Trabajador trabajador;
	private Ingreso ingreso;
	private Ingreso ingresoPorHorasExtra;
	
	@BeforeEach
	void setUp() {
		trabajador = new Trabajador();
		ingreso = new Ingreso("Mayo", "Sueldo", 70000);
		ingresoPorHorasExtra = new IngresoPorHorasExtra("Junio", "Horas Extras", 70000, 5);
		
		trabajador.agregarIngreso(ingreso);
		trabajador.agregarIngreso(ingresoPorHorasExtra);
	}
	
	@Test
	void puedoObtenerElImpuestoTotalAPagar() {
		double impuestoEsperado = ingreso.getMontoPercibido() * 0.02;
		assertEquals(trabajador.getImpuestoAPagar(), impuestoEsperado);
	}
	
	@Test
	void puedoObtenerElTotalPercibido() {
		double totalEsperado = ingreso.getMontoPercibido() + ingresoPorHorasExtra.getMontoPercibido();
		assertEquals(trabajador.getTotalPercibido(), totalEsperado);
	}
	
	@Test
	void puedoObtenerElMontoImponible() {
		double totalEsperado = ingreso.getMontoImponible() + ingresoPorHorasExtra.getMontoImponible();
		assertEquals(trabajador.getMontoImponible(), totalEsperado);
	}
}
