package ar.unq.poo2.tpStateAndStrategy.ej3;

public abstract class MP3State {
	MP3 mp3;
	
	public abstract void play(Song song);
	public abstract void pause(Song song);
	public abstract void stop(Song song);

	public MP3 getMp3() {
		return mp3;
	}

	public void setMp3(MP3 mp3) {
		this.mp3 = mp3;
	}
	
	
}
