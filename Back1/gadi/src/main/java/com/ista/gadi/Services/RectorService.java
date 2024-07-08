package com.ista.gadi.Services;


import java.util.List;

import com.ista.gadi.Entity.Rector;

public interface RectorService {
	
	public List<Rector> findAll();
	public Rector save(Rector rector);
	public Rector findbyId(Long id);
	

}
