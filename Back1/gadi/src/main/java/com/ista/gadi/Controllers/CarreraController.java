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

import com.ista.gadi.Entity.Carrera;
import com.ista.gadi.Services.CarreraService;

@RestController
@RequestMapping("/api")
public class CarreraController {
	@Autowired
	private CarreraService carreraService;
	
	@GetMapping("/carrera")
	public List<Carrera> index(){
		return carreraService.findAll();
	}
	
	@GetMapping("/carrera/{id}")
	public Carrera show(@PathVariable Long id) {
		return carreraService.findbyId(id);
	}
	
	@PostMapping("/carrera")
	@ResponseStatus(HttpStatus.CREATED)
	public Carrera create(@RequestBody Carrera carrera) {
		return carreraService.save(carrera);
	}
	
	@PutMapping("/carrera/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Carrera update(@RequestBody Carrera carrera, @PathVariable Long id) {
		Carrera carreraActual = carreraService.findbyId(id);
		carreraActual.setCodigo(carrera.getCodigo());
		carreraActual.setFecha_inicio(carrera.getFecha_inicio());
		carreraActual.setHoras_semanales(carrera.getHoras_semanales());
		carreraActual.setNombre_carrera(carrera.getNombre_carrera());
		return carreraService.save(carreraActual);
	}
	
	@DeleteMapping("/carrera/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		carreraService.delete(id);
	}

}
