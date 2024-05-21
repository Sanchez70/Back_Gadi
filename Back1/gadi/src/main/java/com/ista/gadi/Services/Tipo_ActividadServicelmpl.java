package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Tipo_Actividad_Dao;
import com.ista.gadi.Entity.Tipo_Actividad;

@Service
public class Tipo_ActividadServicelmpl implements Tipo_ActividadService{

	@Autowired
	private I_Tipo_Actividad_Dao tipoActividadDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipo_Actividad> findAll() {
		
		return (List<Tipo_Actividad>) tipoActividadDao.findAll();
	}

	@Override
	public Tipo_Actividad save(Tipo_Actividad tipoActividad) {

		return tipoActividadDao.save(tipoActividad);
	}

	@Override
	@Transactional(readOnly = true)
	public Tipo_Actividad findbyId(Long id) {
		return tipoActividadDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
	tipoActividadDao.deleteById(id);
		
	}
	
	

}
