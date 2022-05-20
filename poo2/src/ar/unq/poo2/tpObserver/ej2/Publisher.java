package ar.unq.poo2.tpObserver.ej2;

public interface Publisher {
	
	public void suscribir(Listener subscriptor);
	public void desuscribir(Listener subscriptor);
	public void notificar(Partido partido);
}
