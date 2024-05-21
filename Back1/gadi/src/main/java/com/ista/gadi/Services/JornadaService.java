package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Jornada;

public interface JornadaService {
	
	public List<Jornada> findAll();
	public Jornada save(Jornada jornada);
	public Jornada findbyId(Long id);
	public void delete(Long id);
	
	
}
