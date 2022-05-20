package ar.unq.poo2.tpObserver.ej2;

import java.util.ArrayList;
import java.util.List;


public class Servidor extends ListenerDePartidos {
	
	public Servidor(Publisher publisher, List<String> intereses) {
		this.setPublisher(publisher);
		this.setIntereses(intereses);
		this.setPartidosDeInteres(new ArrayList<Partido>());
		this.getPublisher().suscribir(this);
	}
	
	@Override
	public void update(Publisher publisher, Partido partido) {
		this.addPartidoDeInteres(partido);
	}

}
