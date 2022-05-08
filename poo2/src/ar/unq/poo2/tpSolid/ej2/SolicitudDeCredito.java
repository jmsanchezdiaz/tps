package ar.unq.poo2.tpSolid.ej2;

public abstract class SolicitudDeCredito {
	private double monto;
	private int plazoDeMeses;
	private Cliente cliente;
	
	
	public double getMonto() {
		return monto;
	}

	public double getCuotaMensual(){
		return this.getMonto() / this.getPlazoDeMeses();
	}
	public abstract boolean esValida();


	public Cliente getCliente() {
		return cliente;
	}

	public int getPlazoDeMeses() {
		return plazoDeMeses;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setPlazo(int plazo) {
		this.plazoDeMeses = plazo;
	}
	
	public int getPlazo() {
		return this.plazoDeMeses;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
	}

	
	
}
