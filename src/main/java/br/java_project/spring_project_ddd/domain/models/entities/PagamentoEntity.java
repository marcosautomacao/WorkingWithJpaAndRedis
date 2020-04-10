package br.java_project.spring_project_ddd.domain.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.java_project.spring_project_ddd.domain.models.dto.TransacaoDTO;

@Entity
@Table(name = "pagamentos")
public class PagamentoEntity {
	
	public int getId_transacao() {
		return id_transacao;
	}

	public void setId_transacao(int id_transacao) {
		this.id_transacao = id_transacao;
	}

	public AlunoEntity getAluno() {
		return aluno;
	}
	
	public int getIdAluno() {
		return aluno.getId_cliente();
	}

	public void setAluno(AlunoEntity aluno) {
		this.aluno = aluno;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public PagamentoEntity() {
	}

	public PagamentoEntity(TransacaoDTO transacao) {
        this.aluno = new AlunoEntity(transacao.getId_client());
        this.valor = transacao.getValor();
        this.dt_cadastro = transacao.getDt_transacao();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_transacao")
	private int id_transacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aluno")
    private AlunoEntity aluno;
    
	@Column(name = "valor")
	private float valor;

	@Column(name = "dt_cadastro")
	private Date dt_cadastro;

}
