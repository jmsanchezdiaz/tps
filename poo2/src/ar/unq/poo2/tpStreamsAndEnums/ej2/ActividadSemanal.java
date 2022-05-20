package ar.unq.poo2.tpStreamsAndEnums.ej2;

public class ActividadSemanal {
	private DiaDeLaSemana dia;
	private int horaDeInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int hora, int duracion, Deporte deporte){
		this.setDeporte(deporte);
		this.setDia(dia);
		this.setHoraDeInicio(hora);
		this.setDuracion(duracion);
	}
	
	public int precioDeActividad() {
		return this.precioPorHora() + this.precioPorComplejidad();
	}
	
	private int precioPorComplejidad() {
		return 200 * this.getDeporte().getComplejidad();
	}

	private int precioPorHora() {
		if(this.estaEntreJuevesYDomingo()) {
			return this.getDuracion() * 1000;
		}
		
		return this.getDuracion() * 500;
	}

	private boolean estaEntreJuevesYDomingo() {
		DiaDeLaSemana diaDeActividad = this.getDia();
		return DiaDeLaSemana.JUEVES.ordinal() <= diaDeActividad.ordinal() && diaDeActividad.ordinal() <= DiaDeLaSemana.DOMINGO.ordinal();
	}

	public Deporte getDeporte() {
		return deporte;
	}
	
	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public int getHoraDeInicio() {
		return horaDeInicio;
	}
	
	public void setHoraDeInicio(int horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}
	
	public DiaDeLaSemana getDia() {
		return dia;
	}
	
	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}

	public boolean esDe(Deporte dep) {
		return this.getDeporte() == dep;
	}

	public boolean tieneComplejidad(int i) {
		return this.getDeporte().getComplejidad() == i;
	}

	@Override
	public String toString() {
		return String.format("Deporte: %s. Dia: %s A LAS %s . Duracion: %s hora(s).", this.getDeporte(),this.getDia(),this.getHoraDeInicio(),this.getDuracion());
	}
}
