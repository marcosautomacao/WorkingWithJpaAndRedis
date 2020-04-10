package br.java_project.spring_project_ddd.domain.models.dto;

import java.util.Date;

import br.java_project.spring_project_ddd.domain.models.entities.PagamentoEntity;

public class TransacaoDTO {
    public TransacaoDTO() {
	}

	private int id_transacao;
    
    private int id_client;

    private float valor;
    
    private Date dt_transacao;

	public TransacaoDTO(int id_transacao, int id_client, float valor, Date dt_transacao) {
		super();
		this.id_transacao = id_transacao;
		this.id_client = id_client;
		this.valor = valor;
		this.dt_transacao = dt_transacao;
	}

	public TransacaoDTO(PagamentoEntity a) {
		this.id_transacao = a.getId_transacao();
		this.id_client = a.getIdAluno();
		this.valor = a.getValor();
		this.dt_transacao = a.getDt_cadastro();
	}

	public int getId_transacao() {
		return id_transacao;
	}

	public void setId_transacao(int id_transacao) {
		this.id_transacao = id_transacao;
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Date getDt_transacao() {
		return dt_transacao;
	}

	public void setDt_transacao(Date dt_transacao) {
		this.dt_transacao = dt_transacao;
	}
    
    
}
