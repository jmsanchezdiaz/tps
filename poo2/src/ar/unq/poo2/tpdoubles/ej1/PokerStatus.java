package ar.unq.poo2.tpdoubles.ej1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PokerStatus {
	
	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> cardList = Arrays.asList(carta1,carta2,carta3, carta4, carta5);
		List<String> cardsListWithCard1Equals = this.getEqualsOf(cardList, carta1);
		List<String> cardsListWithCard2Equals = this.getEqualsOf(cardList, carta2);
		List<String> cardsListWithCard3Equals = this.getEqualsOf(cardList, carta3);
		

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
	
	private boolean isColor(List<String> cardList) {
		String firstCard = cardList.get(0);
		char palo = this.getPalo(firstCard);
		
		return cardList.stream().allMatch(card -> this.isPaloEqual(card, palo));
	}
	
	private boolean isPaloEqual(String card, char palo) {
		return this.getPalo(card) == palo;
	}

	private char getPalo(String firstCard) {
		return firstCard.charAt(firstCard.length() - 1);
	}

	private boolean isPoker(List<String> cardList) {
		return cardList.size() == 4;
	}
	
	private boolean isTrio(List<String> cardList) {
		return cardList.size() == 3;
	}

	private List<String> getEqualsOf(List<String>cardList, String targetCard){
		return cardList.stream().filter(card -> this.isNumberEqualWith(card, targetCard)).collect(Collectors.toList());
	}
	
	private boolean isNumberEqualWith(String card, String otherCard) {
		
		return this.getNumber(card).equals(this.getNumber(otherCard));
	}

	private String getNumber(String card) {
		if(card.length() == 3) {
			return card.substring(0, 2);
		}
		return card.substring(0, 1);
	}
}
