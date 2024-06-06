package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Distributivo;

public interface DistributivoService {

	
	public List<Distributivo> findAll();
	public Distributivo save(Distributivo distributivo);
	public Distributivo findbyId(Long id);
	public void delete(Long id);
	Distributivo findByIdPersona(Long idPersona);
}
