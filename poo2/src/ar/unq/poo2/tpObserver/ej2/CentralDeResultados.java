package ar.unq.poo2.tpObserver.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CentralDeResultados implements Publisher{
	private List<Listener> subscriptores;
	private List<Partido> partidos;
	
	public CentralDeResultados() {
		this.setPartidos(new ArrayList<Partido>());
		this.subscriptores = new ArrayList<Listener>();
	}

	
	public void addPartido(Partido partido) {
		this.getPartidos().add(partido);
		this.notificar(partido);
	}
	
	@Override
	public void suscribir(Listener subscriptor) {
		if(!this.esSubscriptor(subscriptor)) {
			getSubscriptores().add(subscriptor);
		}
	}

	@Override
	public void desuscribir(Listener subscriptor) {
		if(this.esSubscriptor(subscriptor)) {
			getSubscriptores().remove(subscriptor);
		}
	}

	private List<Listener> getSubscriptores() {
		return this.subscriptores;
	}
	
	public boolean esSubscriptor(Listener subscriptor) {
		return getSubscriptores().contains(subscriptor);
	}

	@Override
	public void notificar(Partido partido) {
		List<Listener> interesados = this.obtenerInteresadosEnPartido(partido);
		
		interesados.forEach(subscriber -> subscriber.update(this, partido));
	}

	private List<Listener> obtenerInteresadosEnPartido(Partido partido) {
		return this.getSubscriptores().stream().filter(subs -> subs.esDeInteres(partido)).collect(Collectors.toList());
	}


	public List<Partido> getPartidos() {
		return partidos;
	}


	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	
}
