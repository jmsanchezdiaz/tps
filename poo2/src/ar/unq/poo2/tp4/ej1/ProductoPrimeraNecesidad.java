package ar.unq.poo2.tp4.ej1;

public class ProductoPrimeraNecesidad extends Producto{
	
	/**
	 * @return una Instancia de Producto
	 * @author juanmasd11
	 * @param nombre del producto
	 * @param precio base del producto, acepta decimales.
	 * @param descuento, el descuento a aplicar en un rango de 1 a 100%.
	 */
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio * (1 - (descuento / 100)));
	}
	
	/**
	 * @return una Instancia de Producto
	 * @author juanmasd11
	 * @param nombre del producto
	 * @param precio base del producto, acepta decimales.
	 * @param esPrecioCuidado, booleano para saber si es precio cuidado.
	 * @param descuento, el descuento a aplicar en un rango de 1 a 100%.
	 */
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre,precio * (1 - (descuento / 100)) , esPrecioCuidado);
	}
}
