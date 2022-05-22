package ar.unq.poo2.tpAdapterAndTemplate.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiltrosTest {
	MismaLetraInicial mli;
	LinkEnComun lec;
	WikipediaPage page;
	WikipediaPage w1;
	WikipediaPage w2;
	WikipediaPage w3;
	WikipediaPage w4;
	private PropiedadEnComun pec;
	
	@BeforeEach
	void setup() {
		mli = new MismaLetraInicial();
		lec = new LinkEnComun();
		pec = new PropiedadEnComun();
		
		Map<String, WikipediaPage> map = new HashMap<String, WikipediaPage>();
		
		map.put("test-id", w2);
		
		w1 = new WikipediaPageConcrete("Wilde", Arrays.asList(page), map);
		w2 = new WikipediaPageConcrete("Buenos Aires", Arrays.asList(w1), map);
		w3 = new WikipediaPageConcrete("Quilmes", Arrays.asList(w2), map);
		w4 = new WikipediaPageConcrete("Newels", Arrays.asList(w1), new HashMap<String, WikipediaPage>());
		page = new WikipediaPageConcrete("Bernal", Arrays.asList(w2), map);
	}
	
	@Test
	void puedoObtenerUnaListaConWikipediaPagesConMismaLetraInicial() {
		assertEquals(mli.getSimilarPages(page, Arrays.asList(w1,w2,w3)), Arrays.asList(w2));
	}
	
	@Test
	void puedoObtenerUnaListaConWikipediaPagesLinksSimilares() {
		
		assertEquals(lec.getSimilarPages(page, Arrays.asList(w1,w2,w3,w4)), Arrays.asList(w3));
	}
	
	@Test
	void puedoObtenerUnaListaConWikipediaPagesPropiedadesInfoboxSimilares() {
		
		assertEquals(pec.getSimilarPages(page, Arrays.asList(w1,w2,w3,w4)), Arrays.asList(w1,w2,w3));
	}
}
