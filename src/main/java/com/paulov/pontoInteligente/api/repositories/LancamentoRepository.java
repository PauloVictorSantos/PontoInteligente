package com.paulov.pontoInteligente.api.repositories;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.paulov.pontoInteligente.api.entities.Lancamento;
import com.sun.xml.bind.v2.model.core.ID;
@Transactional(readOnly = true)
@NamedQueries({
	@NamedQuery(name="LancamentoRepository.findByFuncionarioId", 
			query="SELECT lanc FROM Lancamento lanc WHERE lanc.funcionario.id= :funcionarioId")})
public interface LancamentoRepository extends JpaRepository<Lancamento, ID>{
	
	List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);
	
	Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);

	void deleteById(Long id);

	Lancamento findById(Long id);

}
