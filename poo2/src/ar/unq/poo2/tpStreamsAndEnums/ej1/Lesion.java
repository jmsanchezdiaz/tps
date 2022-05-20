package ar.unq.poo2.tpStreamsAndEnums.ej1;

public enum Lesion {
	
	Rojo("Bajo riesgo", "Baja"), Gris("Poco Riesgo", "Media"), Amarillo("Alto Riesgo", "Alta"), Miel("Muy Riesgoso", "Muy Alta");
	
	String descripcion;
	String nivel;
	
	Lesion(String descripcion, String nivel){
		this.descripcion = descripcion;
		this.nivel = nivel;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

	public String getNivel() {
		return nivel;
	}

	Lesion proximaLesion() {
		Lesion[] valores= Lesion.values();
		int proximoIndice = this.ordinal() + 1 ;
		
		return proximoIndice >= valores.length ? valores[0] : valores[proximoIndice];
	}



}
