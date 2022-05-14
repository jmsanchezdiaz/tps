package ar.unq.poo2.tpComposite.ej2;

import java.util.ArrayList;
import java.util.List;

// COMPOSITE
public class RegionSubdividida implements Region {
	private List<Region> subregiones;
	
	public RegionSubdividida() {
		subregiones = new ArrayList<Region>();
	}
	
	@Override
	public double getGananciaAnual() {
		return this.getSubregiones().stream().mapToDouble(region -> region.getGananciaAnual()).sum();
	}
	
	public void addSubregion(Region newSubregion) throws Exception{
		if(this.cantidadDeSubregiones() >= 4) throw new Exception("No puedes agregar mas subregiones.");
			
		this.getSubregiones().add(newSubregion);
	}

	private int cantidadDeSubregiones() {
		return this.getSubregiones().size();
	}

	private List<Region> getSubregiones() {
		return this.subregiones;
	}
}
