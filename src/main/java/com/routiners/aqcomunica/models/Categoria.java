package com.routiners.aqcomunica.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity									//Fazendo com que a classe seja reconhecida como uma tabela pelo SGBD
@Table(name = "categoria")				//Setando o nome da tabela que o SGBD irá reconhecer a partir da classe
public class Categoria implements Serializable{
	
	public Categoria() {				//Construtor vazio
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	//Fazendo com que o id das categorias seja preenchido automaticamente
	private long id;
	
	@Column(name="categoria")						//setando o nome da coluna que será reconhecida pelo SGBD
	private String categoria;

	
	//Getters e Setters dos atributos da classe
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
