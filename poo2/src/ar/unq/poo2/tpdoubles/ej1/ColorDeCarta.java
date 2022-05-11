package ar.unq.poo2.tpdoubles.ej1;

public enum ColorDeCarta {
	DIAMANTE, PICAS, CORAZONES, TREBOLES;

	boolean isEqualTo(ColorDeCarta palo2) {

		return this.ordinal() == palo2.ordinal();
	}
}
