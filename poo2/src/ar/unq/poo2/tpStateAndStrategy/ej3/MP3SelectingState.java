package ar.unq.poo2.tpStateAndStrategy.ej3;

public class MP3SelectingState extends MP3State {

	@Override
	public void play(Song song) {
		song.play();
		mp3.setEstadoDeReproduccion(new MP3PlayingState());
	}

	@Override
	public void pause(Song song) {
		throw new RuntimeException("No hay una cancion reproduciendose.");
	}

	@Override
	public void stop(Song song) {
		this.pause(song);
	}

}
