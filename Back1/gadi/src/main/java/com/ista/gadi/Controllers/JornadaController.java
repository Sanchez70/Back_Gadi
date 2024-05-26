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

import com.ista.gadi.Entity.Jornada;
import com.ista.gadi.Services.JornadaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class JornadaController {
	@Autowired
	private JornadaService jornadaService;
	
	@GetMapping("/jornada")
	public List<Jornada> index(){
		return jornadaService.findAll();
	}
	
	@GetMapping("/jornada/{id}")
	public Jornada show(@PathVariable Long id) {
		return jornadaService.findbyId(id);
	}
	
	@PostMapping("/jornada")
	@ResponseStatus(HttpStatus.CREATED)
	public Jornada create(@RequestBody Jornada jornada) {
		return jornadaService.save(jornada);
	}
	
	@PutMapping("/jornada/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Jornada update(@RequestBody Jornada jornada, @PathVariable Long id) {
		Jornada jornadaActual = jornadaService.findbyId(id);
		jornadaActual.setDescrip_jornada(jornada.getDescrip_jornada());
		return jornadaService.save(jornadaActual);
	}
	
	@DeleteMapping("/jornada/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		jornadaService.delete(id);
	}

}
