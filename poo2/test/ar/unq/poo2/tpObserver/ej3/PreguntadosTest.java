package ar.unq.poo2.tpObserver.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PreguntadosTest {
	Preguntados preguntados;
	Participante juan;
	Participante valen;
	Participante leo;
	Participante cruz;
	Participante eze;
	Pregunta p1;
	Pregunta p2;
	Pregunta p3;
	Pregunta p4;
	Pregunta p5;
	
	@BeforeEach
	void setup() {
		this.p1 = new Pregunta("¿La invasión de qué fortaleza por parte de los revolucionarios es considerada como el punto de inicio de la Revolución Francesa?", "La toma de la Bastilla");
		this.p2 = new Pregunta("¿En qué año el hombre pisó la Luna por primera vez", "1969");
		this.p3 = new Pregunta("¿Qué evento se considera que desencadenó la Primera Guerra Mundial?", "El asesinato del archiduque Francisco Fernando de Habsburgo");
		this.p4 = new Pregunta("¿Cuánto duró la Guerra de los Cien Años?", "116 años");
		this.p5 = new Pregunta("¿En qué año se creó la Organización de las Naciones Unidas?", "1945");
		
		this.preguntados = new Preguntados(Arrays.asList(p1,p2,p3,p4,p5));
		
		this.juan = new Participante("Juan", this.preguntados);
		this.valen = new Participante("Valen", this.preguntados);
		this.leo = new Participante("Leo", this.preguntados);
		this.cruz = new Participante("Cruz", this.preguntados);
		this.eze = new Participante("Eze", this.preguntados);
	}
	
	@Test
	void preguntadosNotificaQueInicioUnJuegoCuandoHay5Participantes() {
		assertEquals(this.juan.getPreguntasDelJuego(), Arrays.asList(p1,p2,p3,p4,p5));
	}
	
	@Test
	void cuandoHayUnaPreguntaCorrectaSeNotificaATodosYSeSumaElPuntajeDePreguntasCorrectas() {
		
		this.juan.responder(p1, "La toma de la Bastilla");
		assertEquals(this.juan.getCorrectas(), 1);
	}
	
	@Test
	void cuandoHayUnaPreguntaIncorrectaSeNotificaSolamenteAlParticipante() {
		
		this.juan.responder(p1, "La toma de la Wilde");
		assertEquals(this.juan.getCorrectas(), 0);
	}
}
