package com.ista.gadi.Controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ista.gadi.Entity.Enviroment;
import com.ista.gadi.Entity.Usuario;
import com.ista.gadi.Services.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/usuario")
	public List<Usuario> index() {
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

		if (usuarioActual == null) {
			return null;
		}

		if (usuario.getContrasena() != null && !usuario.getContrasena().equals(usuarioActual.getContrasena())) {
			usuarioActual.setContrasena(BCrypt.hashpw(usuario.getContrasena(), BCrypt.gensalt()));
			logger.info("Contraseña Encriptada: " + usuarioActual.getContrasena());
		}

		usuarioActual.setUsuario(usuario.getUsuario());
		usuarioActual.setCarrera(usuario.getCarrera());
		logger.info("Usuario Guardado: " + usuarioService.save(usuarioActual));
		return usuarioService.save(usuarioActual);
	}

	@DeleteMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
}
