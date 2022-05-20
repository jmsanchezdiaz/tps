package ar.unq.poo2.tpStreamsAndEnums.ej2;

public enum Deporte {
	RUNNING(1), FUTBOL(2), BASKET(2), TENNIS(3) , JABALINA(4);

	int complejidad;
	
	Deporte(int i) {
		this.complejidad = i;
	}

	int getComplejidad() {
		return this.complejidad;
	}
}
