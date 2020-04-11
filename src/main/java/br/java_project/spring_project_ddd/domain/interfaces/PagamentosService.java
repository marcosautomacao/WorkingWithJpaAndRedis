package br.java_project.spring_project_ddd.domain.interfaces;

import br.java_project.spring_project_ddd.domain.models.dto.TransacaoDTO;;

public interface PagamentosService {
	
	TransacaoDTO postTransaction(TransacaoDTO transacao);

}
