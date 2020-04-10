package br.java_project.spring_project_ddd.infrastructure;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import br.java_project.spring_project_ddd.domain.models.dto.TransacaoDTO;
import br.java_project.spring_project_ddd.infrastructure.interfaces.PagamentosRepository;

public class PagamentoRepositoryImp implements PagamentosRepository {

	@Query("SELECT u FROM User u WHERE u.status = ?1")
	public List<TransacaoDTO> getPagamentosPorCliente() {
		// TODO Auto-generated method stub
		return null;
	}


}
