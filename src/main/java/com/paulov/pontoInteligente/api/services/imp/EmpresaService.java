package com.paulov.pontoInteligente.api.services.imp;

import java.util.Optional;

import com.paulov.pontoInteligente.api.entities.Empresa;

public interface  EmpresaService {
	
	/**
	 * Retorna uma empresa dado cnpj
	 * @param cnpj
	 * @param Optional<Empresa> 
	 */
	Optional <Empresa> buscarPorCnpj(String cnpj);
	
	
	/*
	 * Cadastra uma nova empresa ba base de dados
	 * @return Empresa
	 * 
	 */
	
	Empresa persistir(Empresa empresa);
	
}
