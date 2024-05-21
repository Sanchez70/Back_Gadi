package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Distributivo_Dao;
import com.ista.gadi.Entity.Distributivo;

@Service
public class DistributivoServicelmpl implements DistributivoService {

	@Autowired
	private I_Distributivo_Dao distributivoDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Distributivo> findAll() {
		return (List<Distributivo>) distributivoDao.findAll();
	}

	@Override
	public Distributivo save(Distributivo distributivo) {
	
		return distributivoDao.save(distributivo);
	}

	@Override
	@Transactional(readOnly = true)
	public Distributivo findbyId(Long id) {
		return distributivoDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		distributivoDao.deleteById(id);
	}

}
