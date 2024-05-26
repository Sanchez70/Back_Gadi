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

import com.ista.gadi.Entity.Titulo_Profesional;
import com.ista.gadi.Services.Titulo_ProfecionalService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class Titulo_ProfecionalController {

	@Autowired
	private Titulo_ProfecionalService tituloProfecionalService;
	
	@GetMapping("/titulo_profesional")
	public List<Titulo_Profesional> index(){
		return tituloProfecionalService.findAll();
	}
	
	@GetMapping("/titulo_profesional/{id}")
	public Titulo_Profesional show(@PathVariable Long id) {
		return tituloProfecionalService.findbyId(id);
	}
	
	@PostMapping("/titulo_profesional")
	@ResponseStatus(HttpStatus.CREATED)
	public Titulo_Profesional create(@RequestBody Titulo_Profesional tituloProfesional) {
		return tituloProfecionalService.save(tituloProfesional);
	}
	
	@PutMapping("/titulo_profesional/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Titulo_Profesional update(@RequestBody Titulo_Profesional tituloProfesional, @PathVariable Long id) {
		Titulo_Profesional tituloProfesionalActual = tituloProfecionalService.findbyId(id);
		tituloProfesionalActual.setGrado(tituloProfesional.getGrado());
		tituloProfesionalActual.setNombre_titulo(tituloProfesional.getNombre_titulo());
		return tituloProfecionalService.save(tituloProfesionalActual);
	}
	
	@DeleteMapping("/titulo_profesional/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		tituloProfecionalService.delete(id);
	}
}
