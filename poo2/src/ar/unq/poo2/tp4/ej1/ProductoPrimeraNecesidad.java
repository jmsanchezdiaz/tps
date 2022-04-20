package ar.unq.poo2.tp4.ej1;

public class ProductoPrimeraNecesidad extends Producto{
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio * 0.9);
	}
	
	/**
	 * @return una Instancia de Producto
	 * @author juanmasd11
	 * @param nombre del producto
	 * @param precio base del producto, acepta decimales.
	 * @param esPrecioCuidado, booleano para saber si es precio cuidado.
	 */
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio * 0.9, esPrecioCuidado);
	}
}
