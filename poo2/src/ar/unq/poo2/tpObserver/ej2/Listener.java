package ar.unq.poo2.tpObserver.ej2;

public interface Listener {

	public void update(Publisher publisher, Partido partido);

	public boolean esDeInteres(Partido partido);
}
