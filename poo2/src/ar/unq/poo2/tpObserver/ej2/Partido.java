package ar.unq.poo2.tpObserver.ej2;

import java.util.List;

public class Partido {
	private String resultado;
	private List<String> contricantes;
	private String deporte;
	
	public Partido(String resultado, List<String> contrincantes, String deporte) {
		this.setResultado(resultado);
		this.setDeporte(deporte);
		this.setContricantes(contrincantes);
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public List<String> getContricantes() {
		return contricantes;
	}

	public void setContricantes(List<String> contricantes) {
		this.contricantes = contricantes;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public boolean esDeporte(String interes) {
		return this.getDeporte().equalsIgnoreCase(interes);
	}

	public boolean esAlgunContrincante(String interes) {
		return this.getContricantes().contains(interes);
	}
	
	
}
