package br.java_project.spring_project_ddd.domain.models.dto;

import java.util.Date;

import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;

public class AlunoDTO {
    private int id_aluno;

    private double matricula;

    private String nome;

    private Date dt_cadastro;

    // Contructors

    public AlunoDTO() { }

    public AlunoDTO(int id_aluno, int matricula, String nome, Date dt_cadastro) {
        this.id_aluno = id_aluno;
        this.matricula = matricula;
        this.nome = nome;
        this.dt_cadastro = dt_cadastro;
    }

    public AlunoDTO(AlunoEntity entity) {
        this.id_aluno = entity.getId_aluno();
        this.matricula = entity.getMatricula();
        this.nome = entity.getNome();
        this.dt_cadastro = entity.getDt_cadastro();
    }
    // Getters and setters

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
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
    
    
}
