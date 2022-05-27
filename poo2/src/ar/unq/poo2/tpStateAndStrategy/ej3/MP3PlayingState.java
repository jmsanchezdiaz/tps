package ar.unq.poo2.tpStateAndStrategy.ej3;

public class MP3PlayingState extends MP3State {

	@Override
	public void play(Song song) {
		throw new RuntimeException("Ya hay una cancion reproduciendose.");
	}

	@Override
	public void pause(Song song) {
		song.pause();
		mp3.setEstadoDeReproduccion(new MP3PausedState());

	}

	@Override
	public void stop(Song song) {
		song.stop();
		mp3.setEstadoDeReproduccion(new MP3SelectingState());
	}

}
