package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Carrera;

public interface CarreraService {
	
	public List<Carrera> findAll();
	public Carrera save(Carrera carrera);
	public Carrera findbyId(Long id);
	public void delete(Long id);
}
