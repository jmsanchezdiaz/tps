package ar.unq.poo2.tpObserver.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CentralDeResultados implements Publisher{
	List<Listener> subscriptores;
	List<Partido> partidos;
	
	public CentralDeResultados() {
		this.partidos = new ArrayList<Partido>();
		this.subscriptores = new ArrayList<Listener>();
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
	
	
}
