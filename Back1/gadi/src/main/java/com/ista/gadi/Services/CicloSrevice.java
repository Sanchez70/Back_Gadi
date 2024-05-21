package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Ciclo;

public interface CicloSrevice {
	public List<Ciclo> findAll();
	public Ciclo save(Ciclo ciclo);
	public Ciclo findbyId(Long id);
	public void delete(Long id);

}
