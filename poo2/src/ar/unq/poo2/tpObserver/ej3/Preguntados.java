package ar.unq.poo2.tpObserver.ej3;

import java.util.ArrayList;
import java.util.List;

public class Preguntados {
	private List<Pregunta> preguntas;
	private List<Participante> participantes;
	
	public Preguntados(List<Pregunta> preguntas) {
		this.setPreguntas(preguntas);
		this.setParticipantes(new ArrayList<Participante>());
	}
	
	public void notificarInicioDeJuego() {
		this.getParticipantes().forEach(participante -> participante.inicioDeJuego(this.getPreguntas()));
	}
	
	public void añadirParticipante(Participante participante) {
		if(!this.getParticipantes().contains(participante)) {
			
			this.getParticipantes().add(participante);
			
			if(this.getParticipantes().size() >= 5) this.notificarInicioDeJuego();
		}
	}
	
	public List<Pregunta> getPreguntas() {
		return preguntas;
	}

	private void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}

	private void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}

	public void recibirRespuestaDe(Pregunta pregunta , Participante participante, String respuesta) {
		if(pregunta.esRespuestaCorrecta(respuesta)) {
			this.notificarRespuestaCorrectaA(participante);
			this.notificarATodosPreguntaCorrecta(participante, pregunta);
		}
		else {
			this.notificarRespuestIncorrectaA(participante, pregunta);
		}
	}

	private void notificarRespuestIncorrectaA(Participante participante, Pregunta preg) {
		participante.respondioIncorrectamente(preg);
	}

	private void notificarRespuestaCorrectaA(Participante participante) {
		participante.respondioCorrectamente();
	}

	private void notificarATodosPreguntaCorrecta(Participante participante, Pregunta pregunta) {
		this.getParticipantes().forEach(part -> part.respuestaCorrecta(part, pregunta));
	}

	
}
