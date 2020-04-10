package br.java_project.spring_project_ddd.domain.interfaces;

import java.util.List;

import br.java_project.spring_project_ddd.domain.models.dto.TransacaoDTO;;

public interface PagamentosService {
    List<TransacaoDTO> find();

    TransacaoDTO findByOne(int id);

    TransacaoDTO postTransaction(TransacaoDTO transacao);

    Void postTransactions(List<TransacaoDTO> transacao);

}
