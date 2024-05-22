package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Titulo_Profesional_Dao;
import com.ista.gadi.Entity.Titulo_Profesional;
@Service
public class Titulo_Profecionallmpl implements Titulo_ProfecionalService{

	@Autowired
	private I_Titulo_Profesional_Dao tituloProfesionalDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Titulo_Profesional> findAll() {
		return (List<Titulo_Profesional>) tituloProfesionalDao.findAll();
	}

	@Override
	public Titulo_Profesional save(Titulo_Profesional tituloProfesional) {
		return tituloProfesionalDao.save(tituloProfesional);
	}

	@Override
	@Transactional(readOnly = true)
	public Titulo_Profesional findbyId(Long id) {
		return tituloProfesionalDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		tituloProfesionalDao.deleteById(id);
		
	}

}
