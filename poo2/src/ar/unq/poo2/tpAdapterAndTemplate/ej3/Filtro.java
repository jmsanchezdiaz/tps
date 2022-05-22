package ar.unq.poo2.tpAdapterAndTemplate.ej3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Filtro {
	
	public final List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		return this.transformarEnLista(wikipedia.stream().filter(wikipage -> this.sonSimilares(wikipage, page)));
	}
	
	public abstract boolean sonSimilares(WikipediaPage aWiki, WikipediaPage otherWiki);
	
	public List<WikipediaPage> transformarEnLista(Stream<WikipediaPage> streamSequence){
		return streamSequence.collect(Collectors.toList());
	}
}
