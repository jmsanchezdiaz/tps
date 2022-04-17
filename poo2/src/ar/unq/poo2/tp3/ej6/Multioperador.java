package ar.unq.poo2.tp3.ej6;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public int suma() {
		int total = 0;
		
		for(Integer num : this.getNumeros()) {
			total += num;
		}
		
		return total;
	}

	private List<Integer> getNumeros() {
		return numeros;
	}

	public void addNumber(int i) {
		this.getNumeros().add(i);
	}

	public int multiplicacion() {
		int total = 1;
		
		for(Integer num : this.getNumeros()) {
			total *= num;
		}
		
		return total;
	}

	public int resta() {
		int total = 0;
		
		for(Integer num : this.getNumeros()) {
			total -= num;
		}
		
		return total;
	}
}
