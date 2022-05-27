package ar.unq.poo2.tpStateAndStrategy.ej3;

public class Song {
	
	String songName;
	Double duration;
	
	public Song(String songName, Double duration) {
		this.songName = songName;
		this.duration = duration;
	}

	public void play() {
		System.out.print(String.format("%s is now playing...", this.getSongName()));
	}
	
	public void stop() {
		System.out.print(String.format("Stopped the reproduction of %s", this.getSongName()));
	}
	
	public void pause() {
		System.out.print(String.format("%s is now paused...", this.getSongName()));
	}
	
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Double getDuration() {
		return duration;
	}



	public void setDuration(Double duration) {
		this.duration = duration;
	}

	
}
