package ar.unq.poo2.tp5.ej1;

public class AgenciaCualquiera implements Agencia {

	@Override
	public void registrarPago(Factura factura) {
		System.out.print("Costo: " + factura.getCosto());
	}

}
