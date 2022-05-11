package ar.unq.poo2.tpdoubles.ej1;

import java.util.List;

public class JugadaDePoker {
	private PokerStatusConCarta pokerStatus;
	
	public JugadaDePoker(PokerStatusConCarta pokerStatus) {
		this.setPokerStatus(pokerStatus);
	}

	public PokerStatusConCarta getPokerStatus() {
		return pokerStatus;
	}

	public void setPokerStatus(PokerStatusConCarta pokerStatus) {
		this.pokerStatus = pokerStatus;
	}

	public List<Carta> ganadorEntre(List<Carta> unaMano, List<Carta> otraMano) {
		PokerValues valorDeUnaMano = this.getPokerStatus().verificar(unaMano);
		PokerValues valorDeOtraMano = this.getPokerStatus().verificar(otraMano);
		
		if(valorDeUnaMano.beats(valorDeOtraMano)) {
			return unaMano;
		}
		else if(valorDeOtraMano.beats(valorDeUnaMano)){
			return otraMano;
		}
		else {
			return this.ganadorPorValorDeCartasEntre(unaMano, otraMano);
		}
	}

	private List<Carta> ganadorPorValorDeCartasEntre(List<Carta> unaMano, List<Carta> otraMano) {
		if(this.calculateValueOf(unaMano) > this.calculateValueOf(otraMano)) {
			return unaMano;
		}
		else {
			return otraMano;
		}
	}

	private int calculateValueOf(List<Carta> unaMano) {
		return unaMano.stream().mapToInt(card -> card.getValor().ordinal()).sum();
	}


}
