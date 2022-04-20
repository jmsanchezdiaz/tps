package ar.unq.poo2.tp3.ej6;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	
	public int suma(List<Integer> numeros) {
		int total = 0;
		
		for(Integer num : numeros) {
			total += num;
		}
		
		return total;
	}

	public int multiplicacion(List<Integer> numeros) {
		int total = 1;
		
		for(Integer num : numeros) {
			total *= num;
		}
		
		return total;
	}

	public int resta(List<Integer> numeros) {
		int total = 0;
		
		for(Integer num : numeros) {
			total -= num;
		}
		
		return total;
	}
}
