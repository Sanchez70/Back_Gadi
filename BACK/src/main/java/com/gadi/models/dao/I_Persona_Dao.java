package com.gadi.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.gadi.models.entity.Persona;

public interface I_Persona_Dao extends CrudRepository<Persona, Integer>{
	
}