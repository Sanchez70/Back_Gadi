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
import com.ista.gadi.Entity.Rol;
import com.ista.gadi.Services.RolService;

@RestController
@RequestMapping("/api")
public class RolController {

	@Autowired
	private RolService rolService;
	
	@GetMapping("/rol")
	public List<Rol> index(){
		return rolService.findAll();
	}
	
	@GetMapping("/rol/{id}")
	public Rol show(@PathVariable Long id) {
		return rolService.findbyId(id);
	}
	
	@PostMapping("/rol")
	@ResponseStatus(HttpStatus.CREATED)
	public Rol create(@RequestBody Rol rol) {
		return rolService.save(rol);
	}
	
	@PutMapping("/rol/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Rol update(@RequestBody Rol rol, @PathVariable Long id) {
		Rol rolActual = rolService.findbyId(id);
		rolActual.setNombre_rol(rol.getNombre_rol());
		return rolService.save(rolActual);
	}
	
	@DeleteMapping("/rol/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		rolService.delete(id);
	}
}
