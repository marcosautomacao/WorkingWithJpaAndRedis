package br.java_project.spring_project_ddd.infrastructure;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.java_project.spring_project_ddd.domain.models.entities.PagamentoEntity;

public interface PagamentoRepositoryBase extends JpaRepository<PagamentoEntity, Integer> {
	
	//@Query("select A.* from PAGAMENTOS P inner join ALUNO A ON P.id_aluno = A.id_aluno where P.id_aluno = :id_aluno")
	//public List<PagamentoEntity> findById_aluno(int id_aluno);
	
}