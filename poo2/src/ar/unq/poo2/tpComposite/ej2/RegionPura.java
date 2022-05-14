package ar.unq.poo2.tpComposite.ej2;

//Leaf
public class RegionPura implements Region {
	
	private double gananciaAnual;
	
	public RegionPura(double gananciaAnual) {
		setGananciaAnual(gananciaAnual);
	}
	
	@Override
	public double getGananciaAnual() {
		return gananciaAnual;
	}

	public void setGananciaAnual(double gananciaAnual) {
		this.gananciaAnual = gananciaAnual;
	}
}
