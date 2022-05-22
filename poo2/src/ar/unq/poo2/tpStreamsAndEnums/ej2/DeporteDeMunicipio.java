package ar.unq.poo2.tpStreamsAndEnums.ej2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeporteDeMunicipio {
	private List<ActividadSemanal> actividades;

	public DeporteDeMunicipio() {
		this.setActividades(new ArrayList<ActividadSemanal>());
	}
	
	public List<ActividadSemanal> getActividades() {
		return actividades;
	}

	public void setActividades(List<ActividadSemanal> actividades) {
		this.actividades = actividades;
	}

	public void agendarActividad(ActividadSemanal actividad) {
		this.getActividades().add(actividad);
	}

	public List<ActividadSemanal> todasActividadesDeFutbol() {
		return this.getActividades().stream().filter(act -> act.esDe(Deporte.FUTBOL)).collect(Collectors.toList());
	}

	public List<ActividadSemanal> actividadesConComplejidad(int i) {	
		return this.getActividades().stream().filter(act -> act.tieneComplejidad(i)).collect(Collectors.toList());
	}

	public int cantidadTotalDeHoras() {
		return this.getActividades().stream().mapToInt(act -> act.getDuracion()).sum();
	}

	/**
	 * Obtiene y retorna la actividad menos costosa de un deporte pasado
	 * por parametro.
	 * 
	 * @param deporte - un Deporte.
	 * @return la ActividadSemanal menos costosa de ese deporte.
	 */
	public ActividadSemanal actividadDeMenorCostoDe(Deporte deporte) {
		return this.getActividades()
				.stream()
				.filter(act -> act.esDe(deporte))
				.min(Comparator.comparing((ActividadSemanal act) -> act.precioDeActividad()))
				.get();
	}
	
	/**
	 * Imprime todas las actividades.
	 */
	public void imprimirTodasLasActividades() {
		this.getActividades()
			.stream()
			.forEach(act -> System.out.println(act.toString()));
	}

	/**
	 * Crea un Map con las actividades menos costosas de cada deporte.
	 * 
	 * @author juan manuel
	 * @return Map - Un mapa con los deportes como clave y su actividad menos costosa como valor.
	 */
	public Map<Deporte, ActividadSemanal> actividadesConMenorCosto() {
		Map<Deporte, ActividadSemanal> map = new HashMap<Deporte, ActividadSemanal>();
		
		for(ActividadSemanal act : this.getActividades()){
		   Deporte deporte = act.getDeporte();
		 	if(!map.containsKey(deporte)){
		 		ActividadSemanal actividadMasBarata = this.actividadDeMenorCostoDe(deporte);
		 		map.put(deporte, actividadMasBarata);
		 	}
		}

		return map;
	}
}
