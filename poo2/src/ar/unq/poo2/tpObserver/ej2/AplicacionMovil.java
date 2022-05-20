package ar.unq.poo2.tpObserver.ej2;

import java.util.List;

public class AplicacionMovil implements Listener {

	private List<Partido> partidosDeInteres;
	private List<String> intereses;
	private Publisher publisher;
	
	@Override
	public void update(Publisher publisher, Partido partido) {
		this.addPartidoDeInteres(partido);
	}

	private void addPartidoDeInteres(Partido partido) {
		this.getPartidosDeInteres().add(partido);
	}

	private List<Partido> getPartidosDeInteres() {
		return this.partidosDeInteres;
	}

	@Override
	public boolean esDeInteres(Partido partido) {
		return this.getIntereses().stream().anyMatch(interes -> partido.esAlgunContrincante(interes) || partido.esDeporte(interes));
	}

	public List<String> getIntereses() {
		return intereses;
	}

	public void setInteres(List<String> interes) {
		this.intereses = interes;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}


}
