package ar.unq.poo2.tpComposite.ej3;

import ar.unq.poo2.tp3.ej8.Point;

public class Caballero extends PersonajeBase {
	
	public Caballero(Point posActual) {
		super.setPosicionActual(posActual);
	}
	
	@Override
	public void caminar(Point unPunto) {
		// Implementar caminata segun caballero.
	}
	
	public void vigilarZona() {
		// Vigila la zona
	}
}
