package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Distributivo_Asignatura;

public interface Distributivo_AsignaturaService {
	public List<Distributivo_Asignatura> findAll();
	public Distributivo_Asignatura save(Distributivo_Asignatura distributivoAsignatura);
	public Distributivo_Asignatura findbyId(Long id);
	public void delete(Long id);
}
