package ar.unq.poo2.tpStateAndStrategy.ej1;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultStrategy implements EncriptarStrategy {

	@Override
	public String encriptar(String texto) {
		List<String> textoSplitted = Arrays.asList(texto.split(""));

		Collections.reverse(textoSplitted);
		
		return String.join("" ,textoSplitted);
	}

	@Override
	public String desencriptar(String texto) {
		return this.encriptar(texto);
	}

}
