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

import com.ista.gadi.Entity.Tipo_Contrato;
import com.ista.gadi.Services.Tipo_ContratoService;

@RestController
@RequestMapping("/api")
public class Tipo_ContratoController {

	@Autowired
	private Tipo_ContratoService tipoContratoService;
	
	@GetMapping("/tipo_contrato")
	public List<Tipo_Contrato> index(){
		return tipoContratoService.findAll();
	}
	
	@GetMapping("/tipo_contrato/{id}")
	public Tipo_Contrato show(@PathVariable Long id) {
		return tipoContratoService.findbyId(id);
	}
	
	@PostMapping("/tipo_contrato")
	@ResponseStatus(HttpStatus.CREATED)
	public Tipo_Contrato create(@RequestBody Tipo_Contrato tipoContrato) {
		return tipoContratoService.save(tipoContrato);
	}
	
	@PutMapping("/tipo_contrato/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Tipo_Contrato update(@RequestBody Tipo_Contrato tipoContrato, @PathVariable Long id) {
		Tipo_Contrato tipoContratoActual = tipoContratoService.findbyId(id);
		tipoContratoActual.setHora_contrato(tipoContrato.getHora_contrato());
		tipoContratoActual.setNombre_contrato(tipoContrato.getNombre_contrato());
		return tipoContratoService.save(tipoContratoActual);
	}
	
	@DeleteMapping("/tipo_contrato/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		tipoContratoService.delete(id);
	}
}
