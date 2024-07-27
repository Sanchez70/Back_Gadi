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

import com.ista.gadi.Entity.Distributivo_Actividad;
import com.ista.gadi.Entity.Enviroment;
import com.ista.gadi.Services.Distributivo_ActividadService;

@RestController
@RequestMapping("/api")
public class Distributivo_ActividadController {
	@Autowired
	private Distributivo_ActividadService distributivoActividadService;
	
	@GetMapping("/distributivo_actividad")
	public List<Distributivo_Actividad> index(){
		return distributivoActividadService.findAll();
	}
	
	@GetMapping("/distributivo_actividad/{id}")
	public Distributivo_Actividad show(@PathVariable Long id) {
		return distributivoActividadService.findbyId(id);
	}
	
	@PostMapping("/distributivo_actividad")
	@ResponseStatus(HttpStatus.CREATED)
	public Distributivo_Actividad create(@RequestBody Distributivo_Actividad distributivoActividad) {
		return distributivoActividadService.save(distributivoActividad);
	}
	
	@PutMapping("/distributivo_actividad/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Distributivo_Actividad update(@RequestBody Distributivo_Actividad distributivoActividad, @PathVariable Long id) {
		Distributivo_Actividad distributivoActividadActual = distributivoActividadService.findbyId(id);
		distributivoActividadActual.setHora_no_docente(distributivoActividad.getHora_no_docente());
		distributivoActividadActual.setId_actividad(distributivoActividad.getId_actividad());
		distributivoActividadActual.setId_distributivo(distributivoActividad.getId_distributivo());
		return distributivoActividadService.save(distributivoActividadActual);
	}
	
	@DeleteMapping("/distributivo_actividad/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		distributivoActividadService.delete(id);
	}

}
