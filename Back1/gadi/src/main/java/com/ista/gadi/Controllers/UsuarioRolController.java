package com.ista.gadi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ista.gadi.Entity.UsuarioRol;
import com.ista.gadi.Services.UsuarioRolService;

@RestController
@RequestMapping("/api")
public class UsuarioRolController {

	@Autowired
	private UsuarioRolService usuarioRolService;
	
	@GetMapping("/actividad")
	public List<UsuarioRol> index(){
		return usuarioRolService.findAll();
	}
	
	@GetMapping("/actividad/{id}")
	public UsuarioRol show(@PathVariable Long id) {
		return usuarioRolService.findbyId(id);
	}
	
	@PostMapping("/actividad")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioRol create(@RequestBody UsuarioRol usuarioRol) {
		return usuarioRolService.save(usuarioRol);
	}
	

	
	@DeleteMapping("/actividad/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioRolService.delete(id);
	}
}
