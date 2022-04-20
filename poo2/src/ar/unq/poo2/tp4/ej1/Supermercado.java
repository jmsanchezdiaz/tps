package ar.unq.poo2.tp4.ej1;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}
	
	public void agregarProducto(Producto newProducto) {
		this.getProductos().add(newProducto);
	}
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}
	
	public double getPrecioTotal() {
		double total = 0;
		
		for(Producto producto : this.getProductos()) {
			total += producto.getPrecio();
		}
		
		return total;
	}
}
