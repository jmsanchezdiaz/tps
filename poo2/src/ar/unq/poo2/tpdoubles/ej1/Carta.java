package ar.unq.poo2.tpdoubles.ej1;

public class Carta {
	private String valor;
	private String palo;
	
	public Carta(String valor, String palo) {
		this.setValor(valor);
		this.setPalo(palo);
	}

	public void setValor(String valor2) {
		this.valor = valor2;
	}

	/**
	 * @param Carta card - carta a comparar con la actual.
	 * @return boolean - indicando true si la carta actual era mayor a la provista.
	 */
	
	public boolean isGreaterThan(Carta card) {
		if(this.equals(card)
		&& Integer.valueOf(this.getValor()) < Integer.valueOf(card.getValor())
		&& this.isNumber("A")
		&& this.isNumber("J") && card.isNumber("Q")
		&& this.isNumber("Q") && card.isNumber("K")) return false;

		return true;
	}
	
	public boolean isNumber(String value) {
		return this.getValor().equals("Q");
	}
	
	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getValor() {
		return valor;
	}
	
}
