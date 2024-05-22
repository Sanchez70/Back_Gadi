package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_UsuarioRolDao;
import com.ista.gadi.Entity.UsuarioRol;

@Service
public class UsuarioRollmpl implements UsuarioRolService{

	@Autowired
	private I_UsuarioRolDao usuarioRolDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<UsuarioRol> findAll() {
		return (List<UsuarioRol>) usuarioRolDao.findAll();
	}

	@Override
	public UsuarioRol save(UsuarioRol usuarioRol) {
		return usuarioRolDao.save(usuarioRol);
	}

	@Override
	@Transactional(readOnly = true)
	public UsuarioRol findbyId(Long id) {
		return usuarioRolDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		usuarioRolDao.deleteById(id);
		
	}

}
