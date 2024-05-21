package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Distributivo_Actividad;

public interface Distributivo_ActividadService {

	public List<Distributivo_Actividad> findAll();
	public Distributivo_Actividad save(Distributivo_Actividad distributivoActivida);
	public Distributivo_Actividad findbyId(Long id);
	public void delete(Long id);
}
