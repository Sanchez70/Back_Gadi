package com.ista.gadi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.gadi.Entity.Rector;
import com.ista.gadi.Services.RectorService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class RectorController {
	
	@Autowired
	private RectorService rectorService;
	@PostMapping("/rector")
	@ResponseStatus(HttpStatus.CREATED)
	public Rector create(@RequestBody Rector rector) {
		return rectorService.save(rector);
	}
	
	@PutMapping("/rector/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Rector update(@RequestBody Rector rector, @PathVariable Long id) {
		Rector rectorActual = rectorService.findbyId(id);
		rectorActual.setId_persona(rector.getId_persona());
		return rectorService.save(rectorActual);
	}
	

}
