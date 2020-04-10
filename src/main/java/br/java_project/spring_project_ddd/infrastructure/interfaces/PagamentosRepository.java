package br.java_project.spring_project_ddd.infrastructure.interfaces;

import java.util.List;

import br.java_project.spring_project_ddd.domain.models.dto.TransacaoDTO;

public interface PagamentosRepository {
	
	public List<TransacaoDTO> getPagamentosPorCliente();
	
}
