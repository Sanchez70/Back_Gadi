package com.ista.gadi.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ista.gadi.Entity.Titulo_Profesional;

public interface I_Titulo_Profesional_Dao extends CrudRepository<Titulo_Profesional, Long>{
	@Query("SELECT u FROM Titulo_Profesional u WHERE u.id_persona = :idPersona")
    List<Titulo_Profesional> findByIdPersona(Long idPersona);
}
