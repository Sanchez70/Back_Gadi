package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Asignatura_Dao;
import com.ista.gadi.Entity.Asignatura;

@Service
public class AsiganturaServicelmpl implements AsignaturaService{

	@Autowired
	private I_Asignatura_Dao asignaturaDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Asignatura> findAll() {
		return (List<Asignatura>) asignaturaDao.findAll();
	}

	@Override
	public Asignatura save(Asignatura asigantura) {
		return asignaturaDao.save(asigantura);
	}

	@Override
	@Transactional(readOnly = true)
	public Asignatura findbyId(Long id) {
		return asignaturaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
	asignaturaDao.deleteById(id);
		
	}

}
