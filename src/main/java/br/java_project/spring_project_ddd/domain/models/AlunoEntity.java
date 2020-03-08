package br.java_project.spring_project_ddd.domain.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class AlunoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_aluno")
	private int id_cliente;

	@Column(name = "matricula")
	private int matricula;

	@Column(name = "cpf")
	private int cpf;

	@Column(name = "nome")
	private String nome;

	@Column(name = "e_mail")
	private String e_mail;

	@Column(name = "telefone")
	private int telefone;

	@Column(name = "dt_cadastro")
	private Date dt_cadastro;
	
	@OneToOne(mappedBy = "aluno", targetEntity = EnderecoEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private EnderecoEntity endereco;
}


