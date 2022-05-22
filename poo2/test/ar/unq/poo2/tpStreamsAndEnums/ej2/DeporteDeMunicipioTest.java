package ar.unq.poo2.tpStreamsAndEnums.ej2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import net.bytebuddy.build.ToStringPlugin.Exclude;

public class DeporteDeMunicipioTest {
	DeporteDeMunicipio municipio;
	ActividadSemanal futbol1;
	ActividadSemanal futbol2;
	ActividadSemanal jabalina1;
	
	@BeforeEach
	void setup() {
		this.municipio = new DeporteDeMunicipio();
		this.futbol1 = new ActividadSemanal(DiaDeLaSemana.LUNES, 17, 2, Deporte.FUTBOL);
		this.futbol2 = new ActividadSemanal(DiaDeLaSemana.VIERNES, 17, 5, Deporte.FUTBOL);
		this.jabalina1 = new ActividadSemanal(DiaDeLaSemana.MARTES, 19, 4, Deporte.JABALINA);

		this.municipio.agendarActividad(futbol1);
		this.municipio.agendarActividad(jabalina1);
	}

	
	@Test
	void puedoObtenerTodasLasActividadesDeFutbolTest() {
		assertTrue(this.municipio.todasActividadesDeFutbol().contains(futbol1));
	}
	
	@Test
	void puedoObtenerLasActividadesDeUnaComplejidadDadaTest() {
		assertTrue(this.municipio.actividadesConComplejidad(4).contains(jabalina1));
	}
	
	@Test
	void puedoSaberLaCantidadDeHorasTotalesDelMunicipioTest() {
		assertEquals(this.municipio.cantidadTotalDeHoras(), 6, 0);
	}
	
	@Test
	void puedoSaberLaActividadDeMenorCostoDeUnDeporteDado() {
		this.municipio.agendarActividad(futbol2);
		assertEquals(this.municipio.actividadDeMenorCostoDe(Deporte.FUTBOL), futbol1);
	}

	
	@Test
	void puedoSaberLasActividadesConMenorCostoTest() {
		Map<Deporte, ActividadSemanal> mapEsperado = new HashMap<Deporte, ActividadSemanal>();
		
		this.municipio.agendarActividad(futbol2);
		
		mapEsperado.put(futbol1.getDeporte(), futbol1);
		mapEsperado.put(jabalina1.getDeporte(), jabalina1);
		
		assertEquals(mapEsperado, this.municipio.actividadesConMenorCosto());
	}
	
	@Ignore
	void testImpresion() {
		this.municipio.imprimirTodasLasActividades();

	}
}
