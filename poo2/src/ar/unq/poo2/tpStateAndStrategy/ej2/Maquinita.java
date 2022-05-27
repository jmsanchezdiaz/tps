package ar.unq.poo2.tpStateAndStrategy.ej2;

public class Maquinita {
	Pantalla pantalla;
	Ranura ranura;
	State estado;
	int cantidadDeFichasIngresadas;
	
	public Maquinita(Pantalla pantalla, Ranura ranura) {
		this.pantalla = pantalla;
		this.ranura = ranura;
		this.setEstado(new EstadoApagado());
	}
	
	public Maquinita(Pantalla pantalla, Ranura ranura, State estado) {
		this.pantalla = pantalla;
		this.ranura = ranura;
		this.setEstado(estado);
	}
	
	public void tocarBotonDeInicio() {
		this.getEstado().tocarBotonDeInicio();
	}
	
	public void ingresarFicha() {
		this.getEstado().ingresarFicha();
	}
	
	public void terminarJuego() {
		this.getEstado().terminarJuego();
	}
	
	
	public int getCantidadDeFichasIngresadas() {
		return cantidadDeFichasIngresadas;
	}

	public void setCantidadDeFichasIngresadas(int cantidadDeFichasIngresadas) {
		this.cantidadDeFichasIngresadas = cantidadDeFichasIngresadas;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}
	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}
	public Ranura getRanura() {
		return ranura;
	}
	public void setRanura(Ranura ranura) {
		this.ranura = ranura;
	}
	public State getEstado() {
		return estado;
	}
	public void setEstado(State estado) {
		this.estado = estado;
		this.estado.setMaquinita(this);
	}
	
	
}
