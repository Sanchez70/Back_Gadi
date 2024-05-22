package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Grado_Ocupacional_Dao;
import com.ista.gadi.Entity.Grado_Ocupacional;

@Service
public class Grado_Ocupacionallmpl implements Grado_OcupacionalService{

	@Autowired
	private I_Grado_Ocupacional_Dao gradoOcupacionalDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Grado_Ocupacional> findAll() {
		return (List<Grado_Ocupacional>) gradoOcupacionalDao.findAll();
	}

	@Override
	public Grado_Ocupacional save(Grado_Ocupacional gradoOcupacional) {
		return gradoOcupacionalDao.save(gradoOcupacional);
	}

	@Override
	@Transactional(readOnly = true)
	public Grado_Ocupacional findbyId(Long id) {
		return gradoOcupacionalDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		gradoOcupacionalDao.deleteById(id);
		
	}

}
