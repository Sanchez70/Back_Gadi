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

import com.ista.gadi.Entity.Asignatura;
import com.ista.gadi.Services.AsignaturaService;

@RestController
@RequestMapping("/api")
public class AsignaturaController {
	@Autowired
	private AsignaturaService asignaturaService;
	
	@GetMapping("/asignatura")
	public List<Asignatura> index(){
		return asignaturaService.findAll();
	}
	
	@GetMapping("/asignatura/{id}")
	public Asignatura show(@PathVariable Long id) {
		return asignaturaService.findbyId(id);
	}
	
	@PostMapping("/asignatura")
	@ResponseStatus(HttpStatus.CREATED)
	public Asignatura create(@RequestBody Asignatura asignatura) {
		return asignaturaService.save(asignatura);
	}
	
	@PutMapping("/asignatura/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Asignatura update(@RequestBody Asignatura asignatura, @PathVariable Long id) {
		Asignatura asignaturaActual = asignaturaService.findbyId(id);
		asignaturaActual.setHoras_semanales(asignatura.getHoras_semanales());
		asignaturaActual.setId_carrera(asignatura.getId_carrera());
		asignaturaActual.setId_ciclo(asignatura.getId_ciclo());
		asignaturaActual.setNombre_asignatura(asignatura.getNombre_asignatura());		
		return asignaturaService.save(asignaturaActual);
	}
	
	@DeleteMapping("/asignatura/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		asignaturaService.delete(id);
	}
}
