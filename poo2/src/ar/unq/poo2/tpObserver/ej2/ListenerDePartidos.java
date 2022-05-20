package ar.unq.poo2.tpObserver.ej2;

import java.util.ArrayList;
import java.util.List;

public abstract class ListenerDePartidos implements Listener {
	private List<Partido> partidosDeInteres;
	private List<String> intereses;
	private Publisher publisher;
	
	@Override
	public void update(Publisher publisher, Partido partido) {
		this.addPartidoDeInteres(partido);
	}

	public void setPartidosDeInteres(ArrayList<Partido> partidos) {
		this.partidosDeInteres = partidos;
	}

	public void addPartidoDeInteres(Partido partido) {
		this.getPartidosDeInteres().add(partido);
	}

	public List<Partido> getPartidosDeInteres() {
		return this.partidosDeInteres;
	}

	public boolean tieneA(Partido partido) {
		return this.getPartidosDeInteres().contains(partido);
	}
	
	@Override
	public boolean esDeInteres(Partido partido) {
		return this.getIntereses().stream().anyMatch(interes -> partido.esDeporte(interes));
	}

	public List<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(List<String> interes) {
		this.intereses = interes;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
}
