package com.ista.gadi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.gadi.Dao.I_Tipo_Contrato_Dao;
import com.ista.gadi.Entity.Tipo_Contrato;
@Service
public class Tipo_Contratolmpl implements Tipo_ContratoService {

	@Autowired
	private I_Tipo_Contrato_Dao tipoContratoDao;
		
	@Override
	@Transactional(readOnly = true)
	public List<Tipo_Contrato> findAll() {
		return (List<Tipo_Contrato>) tipoContratoDao.findAll();
	}

	@Override
	public Tipo_Contrato save(Tipo_Contrato tipoContrato) {
		return tipoContratoDao.save(tipoContrato);
	}

	@Override
	@Transactional(readOnly = true)
	public Tipo_Contrato findbyId(Long id) {
		return tipoContratoDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		tipoContratoDao.deleteById(id);
		
	}

}
