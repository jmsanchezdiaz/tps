package ar.unq.poo2.tpdoubles.ej1;

public enum PokerValues {
	NOTHING,TRIO, COLOR, POKER;
	
	public boolean beats(PokerValues value) {
		return this.ordinal() > value.ordinal();
	}
}
