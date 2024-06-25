package com.ista.gadi.Services;

import java.util.List;
import com.ista.gadi.Entity.Titulo_Profesional;

public interface Titulo_ProfecionalService {
	
	public List<Titulo_Profesional> findAll();
	public Titulo_Profesional save(Titulo_Profesional tituloProfesional);
	public Titulo_Profesional findbyId(Long id);
	public void delete(Long id);
	public List<Titulo_Profesional> findByIdPersona(Long idPersona);
}
