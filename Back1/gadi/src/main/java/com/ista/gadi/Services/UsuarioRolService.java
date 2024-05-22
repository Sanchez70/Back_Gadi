package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.UsuarioRol;


public interface UsuarioRolService {
	
	public List<UsuarioRol> findAll();
	public UsuarioRol save(UsuarioRol usuarioRol);
	public UsuarioRol findbyId(Long id);
	public void delete(Long id);

}
