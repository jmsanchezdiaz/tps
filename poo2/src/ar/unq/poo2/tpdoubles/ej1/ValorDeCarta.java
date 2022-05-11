package ar.unq.poo2.tpdoubles.ej1;

public enum ValorDeCarta {
	DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, J, Q, K , A;

	boolean isGreaterThan(ValorDeCarta valor) {
		return this.ordinal() > valor.ordinal();
	}
}
