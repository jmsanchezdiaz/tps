package ar.unq.poo2.tpAdapterAndTemplate.ej4;

public abstract class LlamadaTelefonica {
	private int tiempo;
	private int horaDelDia;
	
	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	
	//Concrete
	public int getTiempo(){
		return this.tiempo;
	}

	//Concrete
	public int getHoraDelDia(){
		return this.horaDelDia;
	}
	
	//Native
	public abstract boolean esHoraPico();
	
	//Template method
	public float costoFinal(){
		if(this.esHoraPico()){
			return this.costoNeto()*1.2f*this.getTiempo();
		}
		else{
			return this.costoNeto()*this.getTiempo();
		}
	}
	
	//Concrete
	public float costoNeto(){
		return this.getTiempo()*1;
	}
}