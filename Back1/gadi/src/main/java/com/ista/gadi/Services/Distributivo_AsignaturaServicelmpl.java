package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Distributivo_Asignatura_Dao;
import com.ista.gadi.Entity.Distributivo_Asignatura;

@Service
public class Distributivo_AsignaturaServicelmpl implements Distributivo_AsignaturaService{

	@Autowired
	private I_Distributivo_Asignatura_Dao distributivoAsignaturaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Distributivo_Asignatura> findAll() {
		return (List<Distributivo_Asignatura>) distributivoAsignaturaDao.findAll();
	}

	@Override
	public Distributivo_Asignatura save(Distributivo_Asignatura distributivoAsignatura) {
		return distributivoAsignaturaDao.save(distributivoAsignatura);
	}

	@Override
	@Transactional(readOnly = true)
	public Distributivo_Asignatura findbyId(Long id) {
		return distributivoAsignaturaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		distributivoAsignaturaDao.deleteById(id);
		
	}

}
