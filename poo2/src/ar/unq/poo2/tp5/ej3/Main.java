package ar.unq.poo2.tp5.ej3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Nombrable> list = new ArrayList<>();
		Mascota luna = new Mascota("Luna", "Golden");
		Mascota tina = new Mascota("Tina", "Terrier");
		Persona juan = new Persona("Juan", LocalDate.of(2002, 5, 11));
		Persona lucas = new Persona("Lucas", LocalDate.of(2002, 3, 7));

		list.add(luna);
		list.add(tina);
		list.add(juan);
		list.add(lucas);
		
		list.forEach(elm -> System.out.println(elm.getName()));
		
		
	}

}
