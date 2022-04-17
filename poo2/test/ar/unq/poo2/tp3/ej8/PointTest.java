package ar.unq.poo2.tp3.ej8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PointTest {
	Point punto;
	Point otroPunto;
	
	@BeforeEach
	void setUp() {
		punto = new Point();
		otroPunto = new Point(5, 10);
	}
	
	@Test
	void cuandoNoLePasoParametrosElPuntoSeInicializaEnCero() {
		assertEquals(punto.getX(), 0);
		assertEquals(punto.getY(), 0);
	}
	
	@Test
	void puedoInicializarUnPuntoConParametros() {
		assertEquals(otroPunto.getX(), 5);
		assertEquals(otroPunto.getY(), 10);
	}
	
	@Test
	void puedoMoverUnPuntoAOtro() {
		Point nuevaPosicion = new Point(10, 5);
		
		punto.movePoint(nuevaPosicion);
		
		assertEquals(punto.getX(), 10);
		assertEquals(punto.getY(), 5);
	}
	
	@Test
	void puedoSumar2PuntosYObtenerElResultado() {
		int resX = punto.getX() + otroPunto.getX();
		int resY = punto.getY() + otroPunto.getY();
		
		Point resPoint = punto.sumPoint(otroPunto);
		
		assertEquals(resPoint.getX(), resX);
		assertEquals(resPoint.getY(), resY);
		
	}
}
