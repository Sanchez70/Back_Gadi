package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Persona_Dao;
import com.ista.gadi.Entity.Persona;
@Service
public class Personalmpl implements PersonaService{
	
	@Autowired
	private I_Persona_Dao personaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	public Persona save(Persona persona) {
		return personaDao.save(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findbyId(Long id) {
		return personaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		personaDao.deleteById(id);
		
	}
	
	@Override
	@Transactional(readOnly = true)
	public Persona findByCedula(String cedula) {
	    return personaDao.findByCedula(cedula);
	}

}
