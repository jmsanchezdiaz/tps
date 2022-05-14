package ar.unq.poo2.tpComposite.ej3;

import ar.unq.poo2.tp3.ej8.Point;

public abstract class PersonajeBase implements Personaje {

	private Point posicionActual;
	
	public abstract void caminar(Point unPunto);

	public Point getPosicionActual() {
		return posicionActual;
	}

	public void setPosicionActual(Point posicionActual) {
		this.posicionActual = posicionActual;
	}
}
