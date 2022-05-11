package ar.unq.poo2.tpdoubles.ej1;

import java.util.List;
import java.util.stream.Collectors;


public class PokerStatusConCarta {
	/**
	 * @param List<Carta> cardList - recibe una lista de cartas.
	 * @return String - retorna un string poker , trio, color o nada.
	 * @author juanmasd11
	 */
	public PokerValues verificar(List<Carta> cardList) {
		Carta carta1 = cardList.get(0);
		Carta carta2 = cardList.get(1);
		Carta carta3 = cardList.get(2);
		
		List<Carta> cardsListWithCard1Equals = this.getEqualsOf(cardList, carta1);
		List<Carta> cardsListWithCard2Equals = this.getEqualsOf(cardList, carta2);
		List<Carta> cardsListWithCard3Equals = this.getEqualsOf(cardList, carta3);
		

		if(this.isPoker(cardsListWithCard1Equals) || this.isPoker(cardsListWithCard2Equals)|| this.isPoker(cardsListWithCard3Equals)) {
			return PokerValues.POKER;
		}
		else if(this.isTrio(cardsListWithCard1Equals) || this.isTrio(cardsListWithCard2Equals) || this.isTrio(cardsListWithCard3Equals)) {
			return PokerValues.TRIO;
		}
		else if(this.isColor(cardList)) {
			return PokerValues.COLOR;
		}
		return PokerValues.NOTHING;
	}
	
	/**
	 * 
	 * @param cardList : lista de cartas
	 * @return true si el mazo es color.
	 */
	public boolean isColor(List<Carta> cardList) {
		Carta firstCard = cardList.get(0);
		
		return cardList.stream().allMatch(card -> this.isSamePaloThat(card, firstCard));
	}

	/**
	 * 
	 * @param card
	 * @param otherCard
	 * @return true si ambas cartas son del mismo palo
	 */
	public boolean isSamePaloThat(Carta card, Carta otherCard) {
		return card.getPalo() == otherCard.getPalo();
	}
	
	/**
	 * 
	 * @param cardList
	 * @return true si el mazo es poker
	 */
	
	public boolean isPoker(List<Carta> cardList) {
		return cardList.size() == 4;
	}
	
	/**
	 * 
	 * @param cardList
	 * @return boolean - true si es trio
	 */
	public boolean isTrio(List<Carta> cardList) {
		return cardList.size() == 3;
	}

	/**
	 * 
	 * @param card
	 * @param otherCard
	 * @return boolean - true si ambas cartas son del mismo valor
	 */
	private boolean isSameNumberThat(Carta card, Carta otherCard) {
		return card.getValor() == otherCard.getValor();
	}
	
	/**
	 * 
	 * @param cardList
	 * @param carta1
	 * @return List<Carta> una lista de cartas del mismo valor
	 */
	private List<Carta> getEqualsOf(List<Carta> cardList, Carta carta1){
		return cardList.stream().filter(card -> this.isSameNumberThat(card, carta1)).collect(Collectors.toList());
	}

}
