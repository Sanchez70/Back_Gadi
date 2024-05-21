package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Jornada_Dao;
import com.ista.gadi.Entity.Jornada;

@Service
public class JornadaServicelmpl  implements JornadaService{

	@Autowired
	private I_Jornada_Dao jornadaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Jornada> findAll() {
		return (List<Jornada>) jornadaDao.findAll();
	}

	@Override
	public Jornada save(Jornada jornada) {
		return jornadaDao.save(jornada);
	}

	@Override
	@Transactional(readOnly = true)
	public Jornada findbyId(Long id) {
		return jornadaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		jornadaDao.deleteById(id);
		
	}

}
