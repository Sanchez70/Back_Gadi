package com.ista.gadi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.gadi.Entity.Actividad;
import com.ista.gadi.Services.ActividadService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ActividadController {
	@Autowired
	private ActividadService actividadService;
	
	@GetMapping("/actividad")
	public List<Actividad> index(){
		return actividadService.findAll();
	}
	
	@GetMapping("/actividad/{id}")
	public Actividad show(@PathVariable Long id) {
		return actividadService.findbyId(id);
	}
	
	@PostMapping("/actividad")
	@ResponseStatus(HttpStatus.CREATED)
	public Actividad create(@RequestBody Actividad actividad) {
		return actividadService.save(actividad);
	}
	
	@PutMapping("/actividad/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Actividad update(@RequestBody Actividad actividad, @PathVariable Long id) {
		Actividad actividadActual = actividadService.findbyId(id);
		actividadActual.setHoras_no_docentes(actividad.getHoras_no_docentes());
		actividadActual.setId_tipo_actividad(actividad.getId_tipo_actividad());
		actividadActual.setNombre_Actividad(actividad.getNombre_Actividad());
		actividadActual.setDescripcion_actividad(actividad.getDescripcion_actividad());
		return actividadService.save(actividadActual);
	}
	
	@DeleteMapping("/actividad/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		actividadService.delete(id);
	}
}
