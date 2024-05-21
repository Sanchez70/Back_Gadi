package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Asignatura;

public interface AsignaturaService {
	public List<Asignatura> findAll();
	public Asignatura save(Asignatura asigantura);
	public Asignatura findbyId(Long id);
	public void delete(Long id);
}
