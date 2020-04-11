package br.java_project.spring_project_ddd.domain.models.entities;

import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class AlunoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_aluno")
	private int id_aluno;

	@Column(name = "matricula")
	private double matricula;

	@Column(name = "nome")
	private String nome;

	@Column(name = "dt_cadastro")
	private Date dt_cadastro;
	
	@OneToOne(mappedBy = "aluno", targetEntity = EnderecoEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private EnderecoEntity endereco;

	public AlunoEntity() {};

	public AlunoEntity(AlunoDTO aluno) {
		this.matricula = aluno.getMatricula();
		this.nome = aluno.getNome();
		this.dt_cadastro = aluno.getDt_cadastro();
	}
	
	public AlunoEntity(String nome, double matricula) {
		this.matricula = matricula;
		this.nome = nome;
		this.dt_cadastro = new Date();
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}
}


