package ar.unq.poo2.tpObserver.ej1;

import java.util.List;

public class Articulo {
	private String titulo;
	private String lugar;
	private List<String> autores;
	private List<String> keywords;
	private String tipo;
	
	public Articulo(String titulo, String lugar, List<String> autores, List<String> keywords, String tipo) {
		this.setAutores(autores);
		this.setLugar(lugar);
		this.setTitulo(titulo);
		this.setTipo(tipo);
		this.setKeywords(keywords);
	}

	
	public List<String> getAutores() {
		return autores;
	}
	
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	
	
}
