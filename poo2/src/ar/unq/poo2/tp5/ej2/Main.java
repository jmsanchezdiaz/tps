package ar.unq.poo2.tp5.ej2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList();
		ColeccionadorDeObjetos.addLast(2, list);
		ColeccionadorDeObjetos.addLast(4, list);
		ColeccionadorDeObjetos.addLast(5, list);
		ColeccionadorDeObjetos.addLast(6, list);
		ColeccionadorDeObjetos.addLast(7, list);
		System.out.println(ColeccionadorDeObjetos.getFirstFrom(list));
		System.out.println(ColeccionadorDeObjetos.containsElement(list, 5));
		System.out.println(ColeccionadorDeObjetos.getSubCollection(list, 1, 3));
	}
}
