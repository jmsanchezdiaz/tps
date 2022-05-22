package ar.unq.poo2.tpAdapterAndTemplate.ej3;

public class MismaLetraInicial extends Filtro {

	@Override
	public boolean sonSimilares(WikipediaPage aWiki, WikipediaPage otherWiki) {
		Character firstLetter = otherWiki.getTitle().charAt(0);
		
		return aWiki.getTitle().startsWith(firstLetter.toString());
	}
}
