package com.ista.gadi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.gadi.Entity.Tipo_Actividad;
import com.ista.gadi.Services.Tipo_ActividadService;

@RestController
@RequestMapping("/api")
public class Tipo_ActividadController {
	@Autowired
	private Tipo_ActividadService tipoActividadService;
	
	@GetMapping("/tipo_actividad")
	public List<Tipo_Actividad> index(){
		return tipoActividadService.findAll();
	}
	
	@GetMapping("/tipo_actividad/{id}")
	public Tipo_Actividad show(@PathVariable Long id) {
		return tipoActividadService.findbyId(id);
	}
	
	@PostMapping("/tipo_actividad")
	@ResponseStatus(HttpStatus.CREATED)
	public Tipo_Actividad create(@RequestBody Tipo_Actividad tipoActividad) {
		return tipoActividadService.save(tipoActividad);
	}
	
	@PutMapping("/tipo_actividad/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tipo_Actividad update(@RequestBody Tipo_Actividad tipoActividad, @PathVariable Long id) {
		Tipo_Actividad tipoActividadActual = tipoActividadService.findbyId(id);
		tipoActividadActual.setNom_tip_actividad(tipoActividad.getNom_tip_actividad());
		return tipoActividadService.save(tipoActividadActual);
	}
	
	@DeleteMapping("/tipo_actividad/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		tipoActividadService.delete(id);
	}
}
