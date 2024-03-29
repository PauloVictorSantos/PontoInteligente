package com.paulov.pontoInteligente.api.services.imp;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulov.pontoInteligente.api.entities.Empresa;
import com.paulov.pontoInteligente.api.repositories.EmpresaRepository;
import com.paulov.pontoInteligente.api.services.EmpresaService;

@Service
public class EmpresaServiceImp implements EmpresaService {
	
	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImp.class);
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando uma empresas para o CNPJ {}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo empresa{}", empresa);
		return this.empresaRepository.save(empresa);
	}
	
	
	
}
