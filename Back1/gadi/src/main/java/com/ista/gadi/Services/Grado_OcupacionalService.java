package com.ista.gadi.Services;

import java.util.List;
import com.ista.gadi.Entity.Grado_Ocupacional;

public interface Grado_OcupacionalService {

	public List<Grado_Ocupacional> findAll();
	public Grado_Ocupacional save(Grado_Ocupacional gradoOcupacional);
	public Grado_Ocupacional findbyId(Long id);
	public void delete(Long id);
}
