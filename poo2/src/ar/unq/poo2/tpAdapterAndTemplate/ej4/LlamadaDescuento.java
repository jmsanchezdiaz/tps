package ar.unq.poo2.tpAdapterAndTemplate.ej4;

public class LlamadaDescuento extends LlamadaTelefonica {
	
	public LlamadaDescuento(int tiempo, int horaDelDia) {
		super(tiempo, horaDelDia);
		
	}
	
	@Override
	public float costoNeto(){
		return this.getTiempo() * 0.95f;
	}

	@Override
	public boolean esHoraPico() {
		return false;
	}

}
