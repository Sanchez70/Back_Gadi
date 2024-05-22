package com.ista.gadi.Services;

import java.util.List;
import com.ista.gadi.Entity.Tipo_Contrato;

public interface Tipo_ContratoService {
	
	public List<Tipo_Contrato> findAll();
	public Tipo_Contrato save(Tipo_Contrato tipoContrato);
	public Tipo_Contrato findbyId(Long id);
	public void delete(Long id);
	
}
