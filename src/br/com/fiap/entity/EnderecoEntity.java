package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Endereco") 
public class EnderecoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "id_endereco")
	private int id;
	
	@Column(name = "rua")
	private String rua;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "cep")
	private String cep;

	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "dt_inclusao")
	private Date dt_inclusao;
	
	@Column(name = "dt_atualizacao")
	private Date dt_atualizacao;
}
