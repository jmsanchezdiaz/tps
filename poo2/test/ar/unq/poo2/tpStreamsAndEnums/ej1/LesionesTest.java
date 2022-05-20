package ar.unq.poo2.tpStreamsAndEnums.ej1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LesionesTest {
	private Lesion lesion;
	
	@BeforeEach
	void setup() {
		this.lesion = Lesion.Gris;
	}
	
	@Test
	void puedoSaberLaDescripcionDeUnaLesionTest() {
		assertEquals(this.lesion.getDescripcion(), "Poco Riesgo");
	}
	
	@Test
	void puedoSaberElNivelDeUnaLesionTest() {
		assertEquals(this.lesion.getNivel(), "Media");
	}
	
	@Test
	void puedoSaberElSiguienteAUnaLesionTest() {
		assertEquals(this.lesion.proximaLesion(), Lesion.Amarillo);
		assertEquals(Lesion.Miel.proximaLesion(), Lesion.Rojo);
	}
}
