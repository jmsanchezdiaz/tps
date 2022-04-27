package ar.unq.poo2.tp5.ej2;

import java.util.Collection;
import java.util.List;

public class ColeccionadorDeObjetos {

	static public Object getFirstFrom(List collection) {
		return collection.get(0);
	}
	
	static public void addLast(Object element, List collection) {
		collection.add(element);
	}
	
	static public Collection getSubCollection(List collection, int start, int end) {
		return collection.subList(start,end);
	}
	
	static public Boolean containsElement(List collection, Object element) {
		return collection.contains(element);
	}
}
