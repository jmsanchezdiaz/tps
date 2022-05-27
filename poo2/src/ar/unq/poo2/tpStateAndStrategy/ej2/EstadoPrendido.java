package ar.unq.poo2.tpStateAndStrategy.ej2;

public class EstadoPrendido extends State {

	@Override
	public void tocarBotonDeInicio() {
		if(maquinita.getCantidadDeFichasIngresadas() > 0) {
			maquinita.getPantalla()
			.mostrar(String.format("Inicia Juego para %s jugador(es)", maquinita.getCantidadDeFichasIngresadas())); 
		}
		else {
			maquinita.getPantalla().mostrar("Ingrese Fichas"); 
		}
		
	}

	@Override
	public void ingresarFicha() {
		maquinita.setCantidadDeFichasIngresadas(maquinita.getCantidadDeFichasIngresadas() + 1);
	}

	@Override
	public void terminarJuego() {
		maquinita.setCantidadDeFichasIngresadas(0);
	}

}
