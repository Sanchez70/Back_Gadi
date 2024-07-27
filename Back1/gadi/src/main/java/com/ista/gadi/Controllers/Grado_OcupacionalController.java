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

import com.ista.gadi.Entity.Enviroment;
import com.ista.gadi.Entity.Grado_Ocupacional;
import com.ista.gadi.Services.Grado_OcupacionalService;

@RestController
@RequestMapping("/api")
public class Grado_OcupacionalController {
	@Autowired
	private Grado_OcupacionalService gradoOcupacionalService;
	
	@GetMapping("/grado_ocupacional")
	public List<Grado_Ocupacional> index(){
		return gradoOcupacionalService.findAll();
	}
	
	@GetMapping("/grado_ocupacional/{id}")
	public Grado_Ocupacional show(@PathVariable Long id) {
		return gradoOcupacionalService.findbyId(id);
	}
	
	@PostMapping("/grado_ocupacional")
	@ResponseStatus(HttpStatus.CREATED)
	public Grado_Ocupacional create(@RequestBody Grado_Ocupacional gradoOcupacional) {
		return gradoOcupacionalService.save(gradoOcupacional);
	}
	
	@PutMapping("/grado_ocupacional/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Grado_Ocupacional update(@RequestBody Grado_Ocupacional gradoOcupacional, @PathVariable Long id) {
		Grado_Ocupacional gradoOcupacionalActual = gradoOcupacionalService.findbyId(id);
		gradoOcupacionalActual.setNombre_grado_ocp(gradoOcupacional.getNombre_grado_ocp());
		return gradoOcupacionalService.save(gradoOcupacionalActual);
	}
	
	@DeleteMapping("/grado_ocupacional/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		gradoOcupacionalService.delete(id);
	}
}
