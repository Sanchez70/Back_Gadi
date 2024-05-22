package com.ista.gadi.Services;

import java.util.List;
import com.ista.gadi.Entity.Rol;

public interface RolService {
	
	public List<Rol> findAll();
	public Rol save(Rol rol);
	public Rol findbyId(Long id);
	public void delete(Long id);

}
