package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Periodo_Dao;
import com.ista.gadi.Entity.Periodo;

@Service
public class PeriodoServicelmpl implements PeriodoService {

	@Autowired
	private I_Periodo_Dao periodoDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Periodo> findAll() {
		return (List<Periodo>) periodoDao.findAll();
	}

	@Override
	public Periodo save(Periodo periodo) {
		
		return periodoDao.save(periodo);
	}

	@Override
	@Transactional(readOnly = true)
	public Periodo findbyId(Long id) {
		return periodoDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
	periodoDao.deleteById(id);
		
	}

}
