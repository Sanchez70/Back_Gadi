package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Actividad;


public interface ActividadService {
	

	public List<Actividad> findAll();
	public Actividad save(Actividad actividad);
	public Actividad findbyId(Long id);
	public void delete(Long id);
}
