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

import com.ista.gadi.Entity.Persona;
import com.ista.gadi.Services.PersonaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/persona")
	public List<Persona> index(){
		return personaService.findAll();
	}
	
	@GetMapping("/persona/{id}")
	public Persona show(@PathVariable Long id) {
		return personaService.findbyId(id);
	}
	
	 @GetMapping("/persona/cedula/{cedula}")
		public Persona showByCedula(@PathVariable String cedula) {
		    return personaService.findByCedula(cedula);
		}
	
	@PostMapping("/persona")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	
	@PutMapping("/persona/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona update(@RequestBody Persona persona, @PathVariable Long id) {
		Persona personaActual = personaService.findbyId(id);
		personaActual.setApellido1(persona.getApellido1());
		personaActual.setApellido2(persona.getApellido2());
		personaActual.setCedula(persona.getCedula());
		personaActual.setCorreo(persona.getCorreo());
		personaActual.setDireccion(persona.getDireccion());
		personaActual.setEdad(persona.getEdad());
		personaActual.setFecha_vinculacion(persona.getFecha_vinculacion());
		personaActual.setId_tipo_contrato(persona.getId_tipo_contrato());
		personaActual.setId_grado_ocp(persona.getId_grado_ocp());
		personaActual.setId_titulo_profesional(persona.getId_titulo_profesional());
		personaActual.setNombre1(persona.getNombre1());
		personaActual.setNombre2(persona.getNombre2());
		personaActual.setTelefono(persona.getTelefono());
		return personaService.save(personaActual);
	}
	
	@DeleteMapping("/persona/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		personaService.delete(id);
	}
}
