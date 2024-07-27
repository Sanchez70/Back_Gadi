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

import com.ista.gadi.Entity.Ciclo;
import com.ista.gadi.Entity.Enviroment;
import com.ista.gadi.Services.CicloSrevice;

@RestController
@RequestMapping("/api")
public class CicloController {
	@Autowired
	private CicloSrevice cicloSrevice;
	
	@GetMapping("/ciclo")
	public List<Ciclo> index(){
		return cicloSrevice.findAll();
	}
	
	@GetMapping("/ciclo/{id}")
	public Ciclo show(@PathVariable Long id) {
		return cicloSrevice.findbyId(id);
	}
	
	@PostMapping("/ciclo")
	@ResponseStatus(HttpStatus.CREATED)
	public Ciclo create(@RequestBody Ciclo ciclo) {
		return cicloSrevice.save(ciclo);
	}
	
	@PutMapping("/ciclo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Ciclo update(@RequestBody Ciclo ciclo, @PathVariable Long id) {
		Ciclo cicloActual = cicloSrevice.findbyId(id);
		cicloActual.setNombre_ciclo(ciclo.getNombre_ciclo());
		return cicloSrevice.save(cicloActual);
	}
	
	@DeleteMapping("/ciclo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		cicloSrevice.delete(id);
	}
}
