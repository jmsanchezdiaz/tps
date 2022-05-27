package ar.unq.poo2.tpStateAndStrategy.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncriptadorNaiveTest {
	EncriptadorNaive encripter;
	EncriptarStrategy defStrat;
	EncriptarStrategy numStrat;
	EncriptarStrategy vowStrat;
	
	@BeforeEach
	void setUp() {
		encripter = new EncriptadorNaive();
		defStrat = new DefaultStrategy();
		numStrat = new NumberStrategy();
		vowStrat = new VowelStrategy();
	}
	
	@Test
	void puedoEncriptarUnTextoConLaEstrategiaDefault() {
		assertEquals(encripter.encriptar("diego"), "ogeid");
	}
	
	@Test
	void puedoDesencriptarUnTextoConLaEstrategiaDefault() {
		assertEquals(encripter.desencriptar("ogeid"), "diego");
	}
	
	@Test
	void puedoEncriptarUnTextoConLaEstrategiaVowel() {
		encripter.setStrategy(vowStrat);
		assertEquals(encripter.encriptar("diego"), "doigu");
	}
	
	@Test
	void puedoDesencriptarUnTextoConLaEstrategiaVowel() {
		encripter.setStrategy(vowStrat);
		assertEquals(encripter.desencriptar("doigu"), "diego");
	}
	
	@Test
	void puedoEncriptarUnTextoConLaEstrategiaNumber() {
		encripter.setStrategy(numStrat);
		assertEquals(encripter.encriptar("diego"), "4,9,5,7,15");
	}
	
	@Test
	void puedoDesencriptarUnTextoConLaEstrategiaNumber() {
		encripter.setStrategy(numStrat);
		assertEquals(encripter.desencriptar("4,9,5,7,15"), "diego");
	}
}
