package ar.unq.poo2.tpObserver.ej2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CentralDeResultadosTest {
	CentralDeResultados central;
	Partido partido1;
	Partido partido2;
	ListenerDePartidos server1;
	ListenerDePartidos app;
	
	@BeforeEach
	void setUp() {
		this.central = new CentralDeResultados();
		this.partido1 = new Partido("Gano Peñarol", Arrays.asList("Peñarol", "Central"), "Handball");
		this.partido2 = new Partido("Gano Independiente", Arrays.asList("Independiente", "Racing"), "Futbol");
		
		this.server1 = new Servidor(this.central, Arrays.asList("Handball"));
		this.app = new AplicacionMovil(this.central, Arrays.asList("Futbol", "Independiente"));
	}
	
	@Test
	void cuandoSeAgregaUnNuevoPartidoSeNotificanSolamenteALosInteresadosEnElTest() {
		this.central.addPartido(partido1);
		
		assertTrue(this.server1.tieneA(partido1));
		assertFalse(this.app.tieneA(partido1));
	}
	
	@Test
	void cuandoSeAgregaUnNuevoPartidoSeNotificanSolamenteALosInteresadosEnElTest2() {
		this.central.addPartido(partido2);
		
		assertFalse(this.server1.tieneA(partido2));
		assertTrue(this.app.tieneA(partido2));
	}
}
