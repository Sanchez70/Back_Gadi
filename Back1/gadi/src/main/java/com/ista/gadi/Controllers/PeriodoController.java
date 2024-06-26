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

import com.ista.gadi.Entity.Periodo;
import com.ista.gadi.Services.PeriodoService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PeriodoController {
	@Autowired
	private PeriodoService periodoService;
	
	@GetMapping("/periodo")
	public List<Periodo> index(){
		return periodoService.findAll();
	}
	
	@GetMapping("/periodo/{id}")
	public Periodo show(@PathVariable Long id) {
		return periodoService.findbyId(id);
	}
	
	@PostMapping("/periodo")
	@ResponseStatus(HttpStatus.CREATED)
	public Periodo create(@RequestBody Periodo periodo) {
		return periodoService.save(periodo);
	}
	
	@PutMapping("/periodo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Periodo update(@RequestBody Periodo periodo, @PathVariable Long id) {
		Periodo periodoActual = periodoService.findbyId(id);
		periodoActual.setFin_periodo(periodo.getFin_periodo());
		periodoActual.setInicio_periodo(periodo.getInicio_periodo());
		periodoActual.setNombre_periodo(periodo.getNombre_periodo());
		periodoActual.setEstado(periodo.getEstado());
		return periodoService.save(periodoActual);
	}
	
	@DeleteMapping("/periodo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		periodoService.delete(id);
	}
}
