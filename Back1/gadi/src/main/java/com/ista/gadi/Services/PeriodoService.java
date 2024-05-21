package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Periodo;

public interface PeriodoService {
	public List<Periodo> findAll();
	public Periodo save(Periodo periodo);
	public Periodo findbyId(Long id);
	public void delete(Long id);
}
