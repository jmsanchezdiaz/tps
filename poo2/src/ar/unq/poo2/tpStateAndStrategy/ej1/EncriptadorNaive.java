package ar.unq.poo2.tpStateAndStrategy.ej1;

public class EncriptadorNaive {
	private EncriptarStrategy strategy;
	
	public EncriptadorNaive(EncriptarStrategy strat) {
		this.setStrategy(strat);
	}
	
	public EncriptadorNaive() {
		this.setStrategy(new DefaultStrategy());
	}
	
	public void setStrategy(EncriptarStrategy strat) {
		this.strategy = strat;
	}

	public String encriptar(String texto) {
		return this.strategy.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return this.strategy.desencriptar(texto);
	}
}
