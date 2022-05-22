package ar.unq.poo2.tpAdapterAndTemplate.ej3;


import java.util.Map;

public class PropiedadEnComun extends Filtro{
	
	@Override
	public boolean sonSimilares(WikipediaPage aWiki, WikipediaPage otherWiki) {
		Map<String, WikipediaPage> infobox = otherWiki.getInfobox();

		return aWiki.getInfobox().keySet().stream().anyMatch(key -> infobox.containsKey(key));
	}
}
