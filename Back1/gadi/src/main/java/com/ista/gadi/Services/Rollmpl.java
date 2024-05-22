package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Rol_Dao;
import com.ista.gadi.Entity.Rol;

@Service
public class Rollmpl implements RolService {
	
	@Autowired
	private I_Rol_Dao rolDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Rol> findAll() {
		return (List<Rol>) rolDao.findAll();
	}

	@Override
	public Rol save(Rol rol) {
		return rolDao.save(rol);
	}

	@Override
	@Transactional(readOnly = true)
	public Rol findbyId(Long id) {
		return rolDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		rolDao.deleteById(id);
		
	}

}
