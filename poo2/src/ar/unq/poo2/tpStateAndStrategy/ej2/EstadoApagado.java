package ar.unq.poo2.tpStateAndStrategy.ej2;

public class EstadoApagado extends State {

	@Override
	public void tocarBotonDeInicio() {
		maquinita.getPantalla().mostrar("Encendiendo...");
		maquinita.setEstado(new EstadoPrendido());
	}

	@Override
	public void ingresarFicha() {
	
	}

	@Override
	public void terminarJuego() {
		// TODO Auto-generated method stub

	}

}
