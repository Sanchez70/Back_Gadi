package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Ciclo_Dao;
import com.ista.gadi.Entity.Ciclo;

@Service
public class CicloServicelmpl implements CicloSrevice{

	@Autowired
	private I_Ciclo_Dao cicloDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ciclo> findAll() {
		return (List<Ciclo>) cicloDao.findAll();
	}

	@Override
	public Ciclo save(Ciclo ciclo) {
		return cicloDao.save(ciclo);
	}

	@Override
	@Transactional(readOnly = true)
	public Ciclo findbyId(Long id) {
		return cicloDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		cicloDao.deleteById(id);
		
	}

}
