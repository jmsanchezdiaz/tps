package ar.unq.poo2.tpStateAndStrategy.ej3;

public class MP3PausedState extends MP3State {

	@Override
	public void play(Song song) {
		song.play();
		mp3.setEstadoDeReproduccion(new MP3PlayingState());
	}

	@Override
	public void pause(Song song) {
		this.play(song);
	}

	@Override
	public void stop(Song song) {
		song.stop();
		mp3.setEstadoDeReproduccion(new MP3SelectingState());

	}

}
