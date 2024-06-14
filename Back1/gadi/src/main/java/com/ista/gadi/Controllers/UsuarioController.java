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

import com.ista.gadi.Entity.Usuario;
import com.ista.gadi.Services.UsuarioService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/usuario")
	public List<Usuario> index(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario show(@PathVariable Long id) {
		return usuarioService.findbyId(id);
	}
	
	@GetMapping("/usuario/persona/{idPersona}")
    public Usuario findByPersonaId(@PathVariable Long idPersona) {
        return usuarioService.findByIdPersona(idPersona);
    }
	
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}

	@PutMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario usuarioActual = usuarioService.findbyId(id);
		usuarioActual.setContrasena(usuario.getContrasena());
		usuarioActual.setUsuario(usuario.getUsuario());
		usuarioActual.setCarrera(usuario.getCarrera());
		return usuarioService.save(usuarioActual);
	}
	
	@DeleteMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
}
