package ar.unq.poo2.tpObserver.ej1;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements Listener {
	private List<Articulo> articulosDeInteres;
	private List<String> intereses;
	private Publisher publisher;
	
	public Investigador(Publisher publisher, List<String> interes) {
		this.setPublisher(publisher);
		this.setIntereses(interes);
		this.setArticulosDeInteres(new ArrayList<Articulo>());
		this.publisher.suscribe(this);
	}
	
	@Override
	public void update(Publisher publisher, Articulo nuevoArticulo) {
		if(this.esDeInteres(nuevoArticulo)) {
			this.addArticuloDeInteres(nuevoArticulo);
		}
	}

	private void addArticuloDeInteres(Articulo nuevoArticulo) {
		this.getArticulosDeInteres().add(nuevoArticulo);
	}

	private boolean esDeInteres(Articulo nuevoArticulo) {
		boolean contieneInteresEnElTitulo = this.getIntereses().stream().anyMatch(interes -> nuevoArticulo.getTitulo().contains(interes));
		boolean contieneInteresEnElTipo = this.getIntereses().stream().anyMatch(interes -> nuevoArticulo.getTipo().contains(interes));
		boolean contieneInteresEnLasKeywords = this.getIntereses().stream().anyMatch(interes -> nuevoArticulo.getKeywords().contains(interes));
		boolean contieneInteresEnLosAutores = this.getIntereses().stream().anyMatch(interes -> nuevoArticulo.getAutores().contains(interes));
		
		return contieneInteresEnElTitulo || contieneInteresEnElTipo || contieneInteresEnLasKeywords || contieneInteresEnLosAutores;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(List<String> intereses) {
		this.intereses = intereses;
	}

	public List<Articulo> getArticulosDeInteres() {
		return articulosDeInteres;
	}

	public void setArticulosDeInteres(List<Articulo> articulosDeInteres) {
		this.articulosDeInteres = articulosDeInteres;
	}


}
