package ar.unq.poo2.tpObserver.ej1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PublisherTest {
	Publisher publisher;
	Investigador inves;
	Articulo article;
	
	@BeforeEach
	void setUp() {
		this.publisher = new Publisher();
		this.inves = new Investigador(this.publisher, Arrays.asList("Smalltalk", "JAVA", "POO"));
	}
	
	@Test
	void cuandoSeAgregaUnArticuloSeNotificaALosSubscriptoresYSiLesInteresaLosAgreganASuListaTest() {
		article = new Articulo("Design Pattern in Smalltalk", "Argentina", Arrays.asList("Eric Gamma", "Maximo Prieto"), Arrays.asList("Smalltalk", "JAVA", "POO"), "Educativo");
	
		this.publisher.addArticulo(article);
		
		assertTrue(this.inves.getArticulosDeInteres().contains(article));
	}
	
	@Test
	void cuandoSeAgregaUnArticuloSeNotificaALosSubscriptoresYSiNoLesInteresaNoLosAgreganASuListaTest() {
		article = new Articulo("How to be a frontend developer", "Argentina", Arrays.asList("Midudev", "GoncyPozzo"), Arrays.asList("Javascript", "Frontend"), "Educativo");
	
		this.publisher.addArticulo(article);
		
		assertFalse(this.inves.getArticulosDeInteres().contains(article));
	}
}
