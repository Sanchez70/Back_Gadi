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

import com.ista.gadi.Entity.Distributivo_Asignatura;
import com.ista.gadi.Entity.Enviroment;
import com.ista.gadi.Services.Distributivo_AsignaturaService;

@RestController
@RequestMapping("/api")
public class Distributivo_AsignaturaController {
	@Autowired
	private Distributivo_AsignaturaService distributivoAsignaturaService;
	
	@GetMapping("/distributivo_asignatura")
	public List<Distributivo_Asignatura> index(){
		return distributivoAsignaturaService.findAll();
	}
	
	@GetMapping("/distributivo_asignatura/{id}")
	public Distributivo_Asignatura show(@PathVariable Long id) {
		return distributivoAsignaturaService.findbyId(id);
	}
	
	@PostMapping("/distributivo_asignatura")
	@ResponseStatus(HttpStatus.CREATED)
	public Distributivo_Asignatura create(@RequestBody Distributivo_Asignatura distributivoAsignatura) {
		return distributivoAsignaturaService.save(distributivoAsignatura);
	}
	
	@PutMapping("/distributivo_asignatura/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Distributivo_Asignatura update(@RequestBody Distributivo_Asignatura distributivoAsignatura, @PathVariable Long id) {
		Distributivo_Asignatura distributivoAsignaturaActual = distributivoAsignaturaService.findbyId(id);
		distributivoAsignaturaActual.setParalelo(distributivoAsignatura.getParalelo());
		distributivoAsignaturaActual.setId_asignatura(distributivoAsignatura.getId_asignatura());
		distributivoAsignaturaActual.setId_distributivo(distributivoAsignatura.getId_distributivo());
		distributivoAsignaturaActual.setId_jornada(distributivoAsignatura.getId_jornada());
		distributivoAsignaturaActual.setAcronimo(distributivoAsignatura.getAcronimo());
		return distributivoAsignaturaService.save(distributivoAsignaturaActual);
	}
	
	@DeleteMapping("/distributivo_asignatura/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		distributivoAsignaturaService.delete(id);
	}
}
