package com.ista.gadi.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ista.gadi.Dao.RectorDao;
import com.ista.gadi.Entity.Rector;

@Service
public class RectorServicelmpl implements RectorService{
	
	@Autowired
	private RectorDao rectorDao;

	@Override
	public Rector save(Rector rector) {
		// TODO Auto-generated method stub
		return rectorDao.save(rector);
	}

	@Override
	public Rector findbyId(Long id) {
		// TODO Auto-generated method stub
		return rectorDao.findById(id).orElse(null);
	}

	@Override
	public List<Rector> findAll() {
		// TODO Auto-generated method stub
		return (List<Rector>) rectorDao.findAll();	}

}
