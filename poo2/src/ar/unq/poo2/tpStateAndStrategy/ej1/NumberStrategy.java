package ar.unq.poo2.tpStateAndStrategy.ej1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberStrategy implements EncriptarStrategy {
	List<String> abc;
	
	public NumberStrategy() {
		abc = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));
	}
	
	@Override
	public String encriptar(String texto) {
		
		List<String> list = Arrays.asList(texto.split(""));
		List<String> resultArr = new ArrayList<String>();
		
		for(String ch : list) {
			if(abc.contains(ch.toLowerCase())) {
				Integer decodeLetter = abc.indexOf(ch.toLowerCase()) + 1;
				resultArr.add(decodeLetter.toString());
			}
			else {
				resultArr.add("0");
			}
		}
		
		return String.join(",", resultArr);
	}

	@Override
	public String desencriptar(String texto) {
		List<String> list = Arrays.asList(texto.split(","));
		List<String> resultArr = new ArrayList<String>();
		
		for(String decodeChar : list) {
			if(decodeChar.equals("0")) {
				resultArr.add(" ");
			} else {
				String chara = abc.get(Integer.parseInt(decodeChar) - 1);
				
				resultArr.add(chara);
			}
		}
		
		return String.join("", resultArr);
	}

}
