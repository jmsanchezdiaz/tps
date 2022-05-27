package ar.unq.poo2.tpStateAndStrategy.ej3;

public class MP3 {
	MP3State estadoDeReproduccion;
	
	public void play(Song sng) {
		this.getEstadoDeReproduccion().play(sng);
	}
	
	public void pause(Song sng) {
		this.getEstadoDeReproduccion().pause(sng);
	}
	
	public void stop(Song sng) {
		this.getEstadoDeReproduccion().stop(sng);
	}

	public MP3State getEstadoDeReproduccion() {
		return estadoDeReproduccion;
	}

	public void setEstadoDeReproduccion(MP3State estadoDeReproduccion) {
		this.estadoDeReproduccion = estadoDeReproduccion;
		this.estadoDeReproduccion.setMp3(this);
	}
	
	
	
}
