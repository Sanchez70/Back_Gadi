package com.ista.gadi.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ista.gadi.Entity.Usuario;

public interface I_Usuario_Dao extends CrudRepository<Usuario, Long>{
	@Query("SELECT u FROM Usuario u WHERE u.id_persona = :idPersona")
    Optional<Usuario> findByIdPersona(Long idPersona);
}
