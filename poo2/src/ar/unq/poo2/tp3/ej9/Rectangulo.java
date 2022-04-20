package ar.unq.poo2.tp3.ej9;

import ar.unq.poo2.tp3.ej8.Point;

public class Rectangulo {
	private Point esquinaSuperiorIzquierda;
	private Point esquinaSuperiorDerecha;
	private Point esquinaInferiorDerecha;
	private Point esquinaInferiorIzquierda;
	private int ancho;
	private int largo;
	
	public Rectangulo(Point esquinaSuperiorIzquierda, int ancho, int largo ) {
		this.setEsquinaSuperiorIzquierda(esquinaSuperiorIzquierda);
		this.ancho = ancho;
		this.largo = largo;
		
		this.setEsquinaSuperiorDerecha(new Point(this.esquinaSuperiorIzquierda.getX() + this.largo,this.esquinaSuperiorIzquierda.getY()));
		this.setEsquinaInferiorDerecha(new Point(this.esquinaSuperiorIzquierda.getX() + this.largo,this.esquinaSuperiorIzquierda.getY() - this.ancho));
		this.setEsquinaInferiorIzquierda(new Point(this.esquinaSuperiorIzquierda.getX() ,this.esquinaSuperiorIzquierda.getY() - this.ancho));
	}
	
	/**
	 * @return the largo
	 */
	public int getLargo() {
		return largo;
	}

	/**
	 * @param largo the largo to set
	 */
	public void setLargo(int largo) {
		this.largo = largo;
	}

	/** 
	 * @return the esquinaSuperiorIzquierda 
	 */
	public Point getEsquinaSuperiorIzquierda() {
		return this.esquinaSuperiorIzquierda;
	}
	
	/**
	 * @param esquinaSuperiorIzquierda the esquinaSuperiorIzquierda to set
	 */
	
	private void setEsquinaSuperiorIzquierda(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}
	
	/**
	 * @return the esquinaSuperiorDerecha
	 */
	public Point getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}

	/**
	 * @param esquinaSuperiorDerecha the esquinaSuperiorDerecha to set
	 */
	private void setEsquinaSuperiorDerecha(Point esquinaSuperiorDerecha) {
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}

	/**
	 * @return the esquinaInferiorDerecha
	 */
	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

	/**
	 * @param esquinaInferiorDerecha the esquinaInferiorDerecha to set
	 */
	private void setEsquinaInferiorDerecha(Point esquinaInferiorDerecha) {
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}

	/**
	 * @return the esquinaInferiorIzquierda
	 */
	public Point getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	/**
	 * @param esquinaInferiorIzquierda the esquinaInferiorIzquierda to set
	 */
	private void setEsquinaInferiorIzquierda(Point esquinaInferiorIzquierda) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	/**
	 * @return el perimetro del rectangulo
	 */
	public int calcularPerimetro() {
		return 2 * (this.getAncho() + this.getLargo());
	}
	
	/**
	 * @return el area del rectangulo
	 */
	public int calcularArea() {
		return this.getAncho() * this.getLargo();
	}
	
	/**
	 * @return si el rectangulo es horizontal
	 */
	public boolean esHorizontal() {
		return this.getLargo() > this.getAncho();
	}
	
	/**
	 * @return si el rectangulo es vertical
	 */
	public boolean esVertical() {
		return !this.esHorizontal();
	}
	
}
