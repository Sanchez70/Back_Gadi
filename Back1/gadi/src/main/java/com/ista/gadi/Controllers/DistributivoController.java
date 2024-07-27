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

import com.ista.gadi.Entity.Distributivo;
import com.ista.gadi.Entity.Enviroment;
import com.ista.gadi.Services.DistributivoService;

@RestController
@RequestMapping("/api")
public class DistributivoController {
	@Autowired
	private DistributivoService distributivoService;
	
	@GetMapping("/distributivo")
	public List<Distributivo> index(){
		return distributivoService.findAll();
	}
	
	@GetMapping("/distributivo/{id}")
	public Distributivo show(@PathVariable Long id) {
		return distributivoService.findbyId(id);
	}
	
	@GetMapping("/distributivo/persona/{idPersona}")
    public Distributivo findByPersonaId(@PathVariable Long idPersona) {
        return distributivoService.findByIdPersona(idPersona);
    }
	
	@PostMapping("/distributivo")
	@ResponseStatus(HttpStatus.CREATED)
	public Distributivo create(@RequestBody Distributivo distributivo) {
		return distributivoService.save(distributivo);
	}
	
	@PutMapping("/distributivo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Distributivo update(@RequestBody Distributivo distributivo, @PathVariable Long id) {
		Distributivo distributivoActual = distributivoService.findbyId(id);
		distributivoActual.setId_periodo(distributivo.getId_periodo());
		distributivoActual.setId_persona(distributivo.getId_persona());
		distributivoActual.setEstado(distributivo.getEstado());
		return distributivoService.save(distributivoActual);
	}
	
	@DeleteMapping("/distributivo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		distributivoService.delete(id);
	}
}
