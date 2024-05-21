package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Carrera_Dao;
import com.ista.gadi.Entity.Carrera;

@Service
public class CarreraServicelmpl implements CarreraService{

	@Autowired
	private I_Carrera_Dao carreraDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Carrera> findAll() {
		return (List<Carrera>) carreraDao.findAll();
	}

	@Override
	public Carrera save(Carrera carrera) {
		return carreraDao.save(carrera);
	}

	@Override
	@Transactional(readOnly = true)
	public Carrera findbyId(Long id) {
		return carreraDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
	carreraDao.deleteById(id);
		
	}
	
	

}
