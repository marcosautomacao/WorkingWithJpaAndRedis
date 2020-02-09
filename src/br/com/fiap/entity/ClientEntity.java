package br.com.fiap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente") 
public class ClientEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "id_cliente")
	private int id;
	
	@Column(name = "id_endereco")
	private int id_endereco;
	
	@Column(name = "cpf")
	private int cpf;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "e-mail")
	private String e_mail;
	
	@Column(name = "telefone")
	private int telefone;
	
	@Column(name = "dt_cadastro")
	private Date dt_cadastro;
}
