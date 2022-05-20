package ar.unq.poo2.tpObserver.ej2;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil extends ListenerDePartidos {
	
	public AplicacionMovil(Publisher publisher, List<String> intereses) {
		this.setPublisher(publisher);
		this.setIntereses(intereses);
		this.setPartidosDeInteres(new ArrayList<Partido>());
		this.getPublisher().suscribir(this);
	}

	@Override
	public boolean esDeInteres(Partido partido) {
		return this.getIntereses().stream().anyMatch(interes -> partido.esAlgunContrincante(interes) || partido.esDeporte(interes));
	}



}
