package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Distributivo_Actividad_Dao;
import com.ista.gadi.Entity.Distributivo_Actividad;

@Service
public class Distributivo_ActividadServicelmpl implements Distributivo_ActividadService{

	@Autowired
	private I_Distributivo_Actividad_Dao distributivoActividadDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Distributivo_Actividad> findAll() {
		return (List<Distributivo_Actividad>) distributivoActividadDao.findAll();
	}

	@Override
	public Distributivo_Actividad save(Distributivo_Actividad distributivoActivida) {
		return distributivoActividadDao.save(distributivoActivida);
	}

	@Override
	@Transactional(readOnly = true)
	public Distributivo_Actividad findbyId(Long id) {
		return distributivoActividadDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		distributivoActividadDao.deleteById(id);
		
	}

}
