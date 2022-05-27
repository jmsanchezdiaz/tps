package ar.unq.poo2.tpStateAndStrategy.ej1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelStrategy implements EncriptarStrategy {

	List<String> vowels;
	
	public VowelStrategy() {
		vowels = Arrays.asList("a", "e", "i", "o", "u");
	}
	
	@Override
	public String encriptar(String texto) {
		List<String> splitted = Arrays.asList(texto.split(""));
		List<String> resultArr = new ArrayList<String>();
		
		for(String chara : splitted) {
			if(vowels.contains(chara.toLowerCase())) {
				resultArr.add(vowels.get(vowels.indexOf(chara) + 1));
			}
			else {
				resultArr.add(chara);
			}
		}
		
		return String.join("", resultArr);
	}

	@Override
	public String desencriptar(String texto) {
		List<String> splitted = Arrays.asList(texto.split(""));
		List<String> resultArr = new ArrayList<String>();
		
		for(String chara : splitted) {
			if(vowels.contains(chara.toLowerCase())) {
				resultArr.add(vowels.get(vowels.indexOf(chara) - 1));
			}
			else {
				resultArr.add(chara);
			}
		}
		
		return String.join("", resultArr);
	}

}
