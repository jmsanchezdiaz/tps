package ar.unq.poo2.tpObserver.ej3;

import java.util.ArrayList;
import java.util.List;

public class Participante implements IParticipante {
	private Preguntados preguntados;
	private String nombre;
	private int correctas;
	private List<Pregunta> preguntasDelJuego;
	
	public Participante(String nombre, Preguntados preguntados) {
		this.setNombre(nombre);
		this.setPreguntados(preguntados);
		this.setPreguntasDelJuego(new ArrayList<Pregunta>());
		this.setCorrectas(0);
		this.getPreguntados().añadirParticipante(this);
	}
	
	@Override
	public void inicioDeJuego(List<Pregunta> preguntas) {
		this.setPreguntasDelJuego(preguntas);
		System.out.println("Inicio De Juego");
	}

	public List<Pregunta> getPreguntasDelJuego() {
		return preguntasDelJuego;
	}

	private void setPreguntasDelJuego(List<Pregunta> preguntasDelJuego) {
		this.preguntasDelJuego = preguntasDelJuego;
	}

	public Preguntados getPreguntados() {
		return preguntados;
	}

	public void setPreguntados(Preguntados preguntados) {
		this.preguntados = preguntados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCorrectas() {
		return correctas;
	}

	private void setCorrectas(int correctas) {
		this.correctas = correctas;
	}

	public void responder(Pregunta pregunta, String string) {
		this.getPreguntados().recibirRespuestaDe(pregunta, this, string);
	}

	public void incrementarPreguntaCorrecta() {
		this.setCorrectas(this.getCorrectas() + 1);
	}

	public void respondioCorrectamente() {
		this.incrementarPreguntaCorrecta();
	}

	public void respuestaCorrecta(Participante part, Pregunta preg) {
		System.out.println(String.format("Participante %s respondio correctamente la pregunta : %s", part.getNombre(), preg.getPregunta()));;
	}

	public void respondioIncorrectamente(Pregunta preg) {
		System.out.println(String.format("Respondiste incorrectamente la pregunta : %s", preg.getPregunta()));;		
	}

}
