package ar.unq.poo2.tpdoubles.ej1;

public class Carta {
	private String valor;
	private String palo;
	
	public Carta(String valor, String palo) {
		this.setValor(valor);
		this.setPalo(palo);
	}

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
	
	public boolean isSamePalo(Carta card) {
		return this.getPalo().equals(card.getPalo());
	}
	
	public boolean isNumberEqualWith(Carta otherCard) {
		return this.getValor().equals(otherCard.getValor());
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

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		Carta otherCard = (Carta) obj;
	
		return this.isSamePalo(otherCard) && this.isNumberEqualWith(otherCard);
	}
	
}
