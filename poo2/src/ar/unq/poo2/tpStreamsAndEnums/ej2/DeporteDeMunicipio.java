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

	public ActividadSemanal actividadDeMenorCostoDe(Deporte futbol) {
		return this.getActividades()
				.stream()
				.min(Comparator.comparing((ActividadSemanal act) -> act.precioDeActividad()))
				.get();
	}
	
	public void imprimirTodasLasActividades() {
		this.getActividades()
			.stream()
			.forEach(act -> System.out.println(act.toString()));
	}

	public Map<Deporte, Optional<ActividadSemanal>> actividadesConMenorCosto() {
		Comparator<ActividadSemanal> compa = Comparator.comparingInt(ActividadSemanal::precioDeActividad);
		
		Map<Deporte, Optional<ActividadSemanal>> map = this.getActividades()
				.stream()
				.collect(Collectors.groupingBy(ActividadSemanal::getDeporte, Collectors.minBy(compa)));
		return map;
	}
}
