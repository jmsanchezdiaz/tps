package ar.unq.poo2.tpStateAndStrategy.ej1;

public class Main {

	public static void main(String[] args) {
		EncriptadorNaive encripter = new EncriptadorNaive();
		
		System.out.println(encripter.encriptar("Sujeto"));
		System.out.println(encripter.desencriptar(encripter.encriptar("Sujeto")));
		
		encripter.setStrategy(new NumberStrategy());
		
		System.out.println(encripter.encriptar("Diego"));
		System.out.println(encripter.desencriptar(encripter.encriptar("Diego")));
		
		encripter.setStrategy(new VowelStrategy());
		
		System.out.println(encripter.encriptar("Diego"));
		System.out.println(encripter.desencriptar(encripter.encriptar("Diego")));
	}

}
