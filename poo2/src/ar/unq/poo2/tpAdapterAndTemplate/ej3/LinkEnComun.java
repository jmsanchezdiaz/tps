package ar.unq.poo2.tpAdapterAndTemplate.ej3;

import java.util.List;


public class LinkEnComun extends Filtro {
	
	@Override
	public boolean sonSimilares(WikipediaPage wikipage, WikipediaPage page) {
		List<WikipediaPage> links = page.getLinks();
		
		return wikipage.getLinks().stream().anyMatch(link -> links.contains(link));
	}
}
