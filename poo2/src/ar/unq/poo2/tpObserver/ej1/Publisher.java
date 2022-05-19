package ar.unq.poo2.tpObserver.ej1;

import java.util.ArrayList;
import java.util.List;

public class Publisher{
	private List<Listener> subscribers;
	private List<Articulo> articulos;
	
	public Publisher() {
		this.setArticulos(new ArrayList<Articulo>());
		this.setSubscribers(new ArrayList<Listener>());
	}

	public void suscribe(Listener sub) {
		if(!this.isSubscriber(sub)) {
			this.getSubscribers().add(sub);
		}
	}

	private boolean isSubscriber(Listener sub) {
		return this.getSubscribers().contains(sub);
	}
	
	public void unsuscribe(Listener sub) {
		if(this.isSubscriber(sub)) {
			this.getSubscribers().remove(sub);
		}
	}
	
	public void addArticulo(Articulo newArticulo) {
		this.getArticulos().add(newArticulo);
		this.notificarSubidaDeArticulo(newArticulo);
	}
	
	public void notificarSubidaDeArticulo(Articulo newArticle) {
		for(Listener subscriber : this.getSubscribers()) {
			subscriber.update(this, newArticle);
		}
	}
	
	public List<Articulo> getArticulos() {
		return articulos;
	}

	private void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public List<Listener> getSubscribers() {
		return subscribers;
	}



	public void setSubscribers(List<Listener> subscribers) {
		this.subscribers = subscribers;
	}
	
}
