package com.ista.gadi.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ista.gadi.Entity.Distributivo;

public interface I_Distributivo_Dao extends CrudRepository<Distributivo, Long>{
	@Query("SELECT u FROM Distributivo u WHERE u.id_persona = :idPersona")
    Optional<Distributivo> findByIdPersona(Long idPersona);
}
