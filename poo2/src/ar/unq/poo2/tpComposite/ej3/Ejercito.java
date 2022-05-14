package ar.unq.poo2.tpComposite.ej3;

import java.util.ArrayList;
import java.util.List;

import ar.unq.poo2.tp3.ej8.Point;

public class Ejercito implements Personaje {

	private List<Personaje> soldados;
	
	public Ejercito(List<Personaje> soldados) {
		this.setSoldados(soldados);
	}
	
	public Ejercito() {
		soldados = new ArrayList<Personaje>();
	}
	
	@Override
	public void caminar(Point unPunto) {
		this.getSoldados().forEach(soldado -> soldado.caminar(unPunto));
	}

	public void addSoldado(Personaje soldado) {
		if(!this.contieneA(soldado)) {
			this.getSoldados().add(soldado);
		}
	}

	private boolean contieneA(Personaje soldado) {
		return this.getSoldados().contains(soldado);
	}
	
	public List<Personaje> getSoldados() {
		return soldados;
	}

	public void setSoldados(List<Personaje> soldados) {
		this.soldados = soldados;
	}

}
