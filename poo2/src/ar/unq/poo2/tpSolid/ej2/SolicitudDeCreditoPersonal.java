package ar.unq.poo2.tpSolid.ej2;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	public SolicitudDeCreditoPersonal(double monto, int plazoDeMeses, Cliente cliente ) {
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setPlazo(plazoDeMeses);
	}
	
	public boolean esSueldoAnualDelClienteAlMenos150000() {
		return this.getCliente().sueldoNetoAnual() >= 15000d;
	}
	
	
	@Override
	public boolean esValida() {
		return (this.esSueldoAnualDelClienteAlMenos150000() && this.esCuotaMensualMenorAl70DelSueldoMensual());
	}

	private boolean esCuotaMensualMenorAl70DelSueldoMensual() {
		double SetentaPorcientoDelSueldoMensual = this.getCliente().getSueldoNetoMensual() * 0.7;
		return this.getCuotaMensual() < SetentaPorcientoDelSueldoMensual;
	}

}
