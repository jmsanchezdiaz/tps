package ar.unq.poo2.tpObserver.ej3;

public class Pregunta {
	private String pregunta;
	private String respuesta;
	
	public Pregunta(String pregunta, String respuesta) {
		this.setPregunta(pregunta);
		this.setRespuesta(respuesta);
	}
	
	public boolean esRespuestaCorrecta(String respuesta) {
		return this.getRespuesta().equalsIgnoreCase(respuesta);
	}
	
	public boolean esRespuestaIncorrecta(String respuesta) {
		return !this.esRespuestaCorrecta(respuesta);
	}
	
	public String getPregunta() {
		return pregunta;
	}
	
	private void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	
	private void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	
}
