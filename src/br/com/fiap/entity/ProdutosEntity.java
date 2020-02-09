package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produtos") 
public class ProdutosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "id_produto")
	private int id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "qtd_estoque")
	private int qtd_estoque;
	
	@Column(name = "preco")
	private long preco;
	
	@Column(name = "dt_inclusao")
	private Date dt_inclusao;
	
	@Column(name = "dt_Atualizacao")
	private Date dt_Atualizacao;
}
