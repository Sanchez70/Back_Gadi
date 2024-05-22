package com.ista.gadi.Services;

import java.util.List;
import com.ista.gadi.Entity.Persona;

public interface PersonaService {

	public List<Persona> findAll();
	public Persona save(Persona persona);
	public Persona findbyId(Long id);
	public void delete(Long id);
}
