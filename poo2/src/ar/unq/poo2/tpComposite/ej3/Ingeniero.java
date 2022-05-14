package ar.unq.poo2.tpComposite.ej3;

import ar.unq.poo2.tp3.ej8.Point;

public class Ingeniero extends PersonajeBase {
	private int cantidadDeLajas;

	
	public Ingeniero(int cantidadDeLajas, Point posActual) {
		super.setPosicionActual(posActual);
		this.setCantidadDeLajas(cantidadDeLajas);
	}
	
	@Override
	public void caminar(Point unPunto) {
		//Implementar caminata
	}
	
	public void colocarLaja() {
		this.decrementarLajaEn(1);
	}

	private void decrementarLajaEn(int n) {
		this.setCantidadDeLajas(this.getCantidadDeLajas() - n);
	}
	
	public int getCantidadDeLajas() {
		return cantidadDeLajas;
	}

	public void setCantidadDeLajas(int cantidadDeLajas) {
		this.cantidadDeLajas = cantidadDeLajas;
	}

}
