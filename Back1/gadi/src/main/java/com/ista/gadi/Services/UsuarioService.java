package com.ista.gadi.Services;

import java.util.List;

import com.ista.gadi.Entity.Usuario;

public interface UsuarioService {

	public List<Usuario> findAll();
	public Usuario save(Usuario usuario);
	public Usuario findbyId(Long id);
	public void delete(Long id);
}
