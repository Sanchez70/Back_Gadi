package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Actividad_Dao;
import com.ista.gadi.Entity.Actividad;

@Service
public class ActividadServicelmpl implements ActividadService{

	@Autowired
	private I_Actividad_Dao actividaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Actividad> findAll() {
		return (List<Actividad>) actividaDao.findAll();
	}

	@Override
	public Actividad save(Actividad actividad) {
		return actividaDao.save(actividad);
	}

	@Override
	@Transactional(readOnly = true)
	public Actividad findbyId(Long id) {
		return actividaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		actividaDao.deleteById(id);	
	}

}
