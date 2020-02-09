package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PedidosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "id_pedido")
	private int id;
	
	@Column(name = "id_cliente")
	private int id_cliente;
	
	@Column(name = "id_produto")
	private int id_produto;
	
	@Column(name = "codigo_pedido")
	private String codigo_pedido;
	
	@Column(name = "qtd_produto")
	private String qtd_produto;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "descricao")
	private long valor_total;
	
	@Column(name = "descricao")
	private Date dt_pedido;
	
	@Column(name = "descricao")
	private Date dt_entrega;

}
