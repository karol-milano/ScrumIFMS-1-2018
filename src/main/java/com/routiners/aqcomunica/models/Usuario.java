package com.routiners.aqcomunica.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {	

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	//fazendo com que o id dos usuários seja preenchido automaticamente
	private long id;

	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="tipo_conta")
	private int tipo_conta;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo_conta() {
		return tipo_conta;
	}

	public void setTipo_conta(int tipo_conta) {
		this.tipo_conta = tipo_conta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
