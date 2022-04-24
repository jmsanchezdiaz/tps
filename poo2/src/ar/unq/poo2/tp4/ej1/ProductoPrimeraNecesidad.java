package ar.unq.poo2.tp4.ej1;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double porcentajeDeDescuento;
	
	/**
	 * @return una Instancia de Producto
	 * @author juanmasd11
	 * @param nombre del producto
	 * @param precio base del producto, acepta decimales.
	 * @param descuento, el descuento a aplicar en un rango de 1 a 100%.
	 */
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		porcentajeDeDescuento = descuento;
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
		super(nombre,precio, esPrecioCuidado);
		porcentajeDeDescuento = descuento;
	}
	
	private double getPorcentajeDeDescuento() {
		return this.porcentajeDeDescuento;
	}
	
	@Override
	public double getPrecio() {
		double precioDescontado = super.getPrecio() * (1 - (this.getPorcentajeDeDescuento() / 100));
		return precioDescontado;
	}
}
