package ar.unq.poo2.tpStateAndStrategy.ej2;

public abstract class State {
	Maquinita maquinita;
	
	public abstract void tocarBotonDeInicio();
	public abstract void ingresarFicha();
	public abstract void terminarJuego();
	
	public void setMaquinita(Maquinita maquinita) {
		this.maquinita = maquinita;
	}
	
}
