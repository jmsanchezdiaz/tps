package ar.unq.poo2.tp4.ej1;

public class Producto {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;
	
	/**
	 * @return una Instancia de Producto
	 * @author juanmasd11
	 * @param nombre del producto
	 * @param precio del producto, acepta decimales.
	 */
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	/**
	 * @return una Instancia de Producto
	 * @author juanmasd11
	 * @param nombre del producto
	 * @param precio del producto, acepta decimales.
	 * @param esPrecioCuidado, booleano para saber si es precio cuidado.
	 */
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this(nombre, precio);
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public double getPrecio() { return this.precio; }
	
	public String getNombre() { return this.nombre; }
	
	public boolean esPrecioCuidado() { return this.esPrecioCuidado; }
	
	private void setPrecio(double newPrecio) {
		this.precio = newPrecio;
	}
	
	public void aumentarPrecio(double cantidadASumar) {
		this.setPrecio(this.getPrecio() + cantidadASumar);
	}
}
