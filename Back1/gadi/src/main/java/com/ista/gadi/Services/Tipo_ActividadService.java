package com.ista.gadi.Services;

import java.util.List;


import com.ista.gadi.Entity.Tipo_Actividad;

public interface Tipo_ActividadService {
	public List<Tipo_Actividad> findAll();
	public Tipo_Actividad save(Tipo_Actividad tipoActividad);
	public Tipo_Actividad findbyId(Long id);
	public void delete(Long id);
}
