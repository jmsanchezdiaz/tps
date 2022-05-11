package ar.unq.poo2.tpdoubles.ej1;

public class Carta {
	private ValorDeCarta valor;
	private ColorDeCarta palo;
	
	public Carta(ValorDeCarta valor, ColorDeCarta palo) {
		this.setValor(valor);
		this.setPalo(palo);
	}

	public void setValor(ValorDeCarta valor2) {
		this.valor = valor2;
	}

	/**
	 * @param Carta card - carta a comparar con la actual.
	 * @return boolean - indicando true si la carta actual era mayor a la provista.
	 */
	
	public boolean isGreaterThan(Carta card) {
		return this.getValor().isGreaterThan(card.getValor());
	}
	
	
	public ColorDeCarta getPalo() {
		return palo;
	}

	public void setPalo(ColorDeCarta palo) {
		this.palo = palo;
	}

	public ValorDeCarta getValor() {
		return valor;
	}

	public boolean isColor(ColorDeCarta palo2) {

		return this.getPalo().isEqualTo(palo2);
	}
	
}
