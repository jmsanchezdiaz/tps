package ar.unq.poo2.tpComposite.ej2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegionTest {
	private RegionSubdividida regionGeneral;
	private RegionSubdividida subregionGeneral;
	private Region regionConSoja;
	private Region regionConTrigo;
	
	@BeforeEach
	void setUp() throws Exception {
		regionConTrigo = new RegionPura(300d);
		regionConSoja = new RegionPura(500d);
		regionGeneral = new RegionSubdividida();
		
		regionGeneral.addSubregion(regionConSoja);
		regionGeneral.addSubregion(regionConTrigo);
		regionGeneral.addSubregion(regionConSoja);
	}
	
	@Test
	void puedoSaberLaGananciaAnualDeUnaRegionPuraTest() {
		assertEquals(regionConSoja.getGananciaAnual(), 500d, 0d);
	}
	
	@Test
	void puedoSaberLaGananciaAnualDeUnaRegionSubdivididaTest() {
		assertEquals(regionGeneral.getGananciaAnual(), 1300d, 0d);
	}
	
	@Test
	void noPuedoAgregarMasDe4SubregionesAUnaParcelaTest() {
		try {
			regionGeneral.addSubregion(regionConTrigo);
			regionGeneral.addSubregion(regionConSoja);
		}
		catch(Exception error) {
			assertEquals(error.getMessage(), "No puedes agregar mas subregiones.");
		}
	}
	
	@Test
	void puedoSaberLaGananciaAnualDeUnaRegionSubdivididaConRegionesSubdividasDentroTest() throws Exception {
		subregionGeneral = new RegionSubdividida();
		
		subregionGeneral.addSubregion(regionConSoja);
		subregionGeneral.addSubregion(regionConTrigo);
		subregionGeneral.addSubregion(regionConSoja);
		subregionGeneral.addSubregion(regionConTrigo);
		
		regionGeneral.addSubregion(subregionGeneral);
		
		assertEquals(regionGeneral.getGananciaAnual(), 2900d, 0d);
	}
}
