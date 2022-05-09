package ar.unq.poo2.tpdoubles.ej1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PokerStatusConCarta {
	
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Carta> cardList = Arrays.asList(carta1,carta2,carta3, carta4, carta5);
		List<Carta> cardsListWithCard1Equals = this.getEqualsOf(cardList, carta1);
		List<Carta> cardsListWithCard2Equals = this.getEqualsOf(cardList, carta2);
		List<Carta> cardsListWithCard3Equals = this.getEqualsOf(cardList, carta3);
		

		if(this.isPoker(cardsListWithCard1Equals) || this.isPoker(cardsListWithCard2Equals)|| this.isPoker(cardsListWithCard3Equals)) {
			return "Poker";
		}
		else if(this.isTrio(cardsListWithCard1Equals) || this.isTrio(cardsListWithCard2Equals) || this.isTrio(cardsListWithCard3Equals)) {
			return "Trio";
		}
		else if(this.isColor(cardList)) {
			return "Color";
		}
		return "";
	}
	
	private boolean isColor(List<Carta> cardList) {
		Carta firstCard = cardList.get(0);
		
		return cardList.stream().allMatch(card -> card.isSamePalo(firstCard));
	}

	private boolean isPoker(List<Carta> cardList) {
		return cardList.size() == 4;
	}
	
	private boolean isTrio(List<Carta> cardList) {
		return cardList.size() == 3;
	}

	private List<Carta> getEqualsOf(List<Carta> cardList, Carta carta1){
		return cardList.stream().filter(card -> card.isNumberEqualWith(carta1)).collect(Collectors.toList());
	}

}
