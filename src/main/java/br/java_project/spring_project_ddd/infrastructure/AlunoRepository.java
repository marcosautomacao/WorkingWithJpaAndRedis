package br.java_project.spring_project_ddd.infrastructure;

import org.springframework.data.repository.CrudRepository;

import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;

public interface AlunoRepository extends CrudRepository<AlunoEntity, Integer> {}