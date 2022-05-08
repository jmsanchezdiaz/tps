package ar.unq.poo2.tpSolid.ej2;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {

	private Propiedad propiedad;
	
	public SolicitudDeCreditoHipotecario(double monto, int plazoDeMeses, Cliente cliente, Propiedad propiedad) {
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setPlazo(plazoDeMeses);
		this.setPropiedad(propiedad);
	}
	
	@Override
	public boolean esValida() {
		double porcentajeDelTotalSolicitado = this.propiedad.getValorFiscal() * 0.7;
		double ingresoMensualPorcentuado = this.getCliente().getSueldoNetoMensual() * 0.5;
		return this.getCliente().getEdad() < 65 && this.getMonto() < porcentajeDelTotalSolicitado && this.getCuotaMensual() < ingresoMensualPorcentuado;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

}
