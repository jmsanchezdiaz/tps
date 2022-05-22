package ar.unq.poo2.tpAdapterAndTemplate.ej3;

import java.util.List;
import java.util.Map;

public class WikipediaPageConcrete implements WikipediaPage {

	private String title;
	private List<WikipediaPage> links;
	private Map<String, WikipediaPage> infobox;
	
	public WikipediaPageConcrete(String title, List<WikipediaPage> links, Map<String, WikipediaPage> infobox) {
		this.setTitle(title);
		this.setInfobox(infobox);
		this.setLinks(links);
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		// TODO Auto-generated method stub
		return this.links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		// TODO Auto-generated method stub
		return this.infobox;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLinks(List<WikipediaPage> links) {
		
		this.links = links;
	}

	public void setInfobox(Map<String, WikipediaPage> infobox) {
		this.infobox = infobox;
	}

	@Override
	public String toString() {
		return this.getTitle();
	}
	
}
