package ar.unq.poo2.tpObserver.ej2;

import java.util.ArrayList;
import java.util.List;


public class Servidor implements Listener {
	private Publisher publisher;
	private List<Partido> partidosDeInteres;
	private List<String> intereses;

	public Servidor(Publisher publisher, List<String> intereses) {
		this.setPublisher(publisher);
		this.setIntereses(intereses);
		this.setPartidosDeInteres(new ArrayList<Partido>());
	}
	
	@Override
	public void update(Publisher publisher, Partido partido) {
		this.addPartidoDeInteres(partido);
	}

	private boolean addPartidoDeInteres(Partido partido) {
		return this.getPartidosDeInteres().add(partido);
	}
	
	@Override
	public boolean esDeInteres(Partido partido) {
		return this.getIntereses().stream().anyMatch(interes -> partido.esDeporte(interes));
	}
	
	public List<String> getIntereses() {
		return intereses;
	}
	
	public void setIntereses(List<String> intereses) {
		this.intereses = intereses;
	}
	
	public List<Partido> getPartidosDeInteres() {
		return partidosDeInteres;
	}
	
	public void setPartidosDeInteres(List<Partido> partidosDeInteres) {
		this.partidosDeInteres = partidosDeInteres;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}
	
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

}
