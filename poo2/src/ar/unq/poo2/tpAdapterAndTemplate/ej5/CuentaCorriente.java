package ar.unq.poo2.tpAdapterAndTemplate.ej5;

public class CuentaCorriente extends CuentaBancaria {

	private int descubierto;
	
	public CuentaCorriente(String titular) {
		super(titular);
		this.setDescubierto(descubierto);
	}


	public int getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(int descubierto) {
		this.descubierto = descubierto;
	}


	@Override
	public boolean validarMonto(double monto) {
		return this.getSaldo() +this.getDescubierto()>=monto;
	}

}
