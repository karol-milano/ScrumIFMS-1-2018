package com.routiners.aqcomunica.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventos")
public class Eventos implements Serializable{
	
	public Eventos() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	//Fazendo com que o id dos eventos seja preenchido automaticamente
	private long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="data")
	private String data;
	
	@Column(name="local")
	private String local;
	
	@Column(name="horario_inicio")
	private String horario_inicio;
	
	@Column(name="horario_fim")
	private String horario_fim;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="id_categoria")
	private long id_categoria;
	
	@Column(name="numero_vagas")
	private int numero_vagas;
	
	@Column(name="nome_contato")
	private String nome_contato;
	
	@Column(name="numero_contato")
	private String numero_contato;
	
	@Column(name="estado")
	private int estado;
	
	@Column(name="administrador")
	private String administrador;
	
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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getHorario_inicio() {
		return horario_inicio;
	}

	public void setHorario_inicio(String horario_inicio) {
		this.horario_inicio = horario_inicio;
	}

	public String getHorario_fim() {
		return horario_fim;
	}

	public void setHorario_fim(String horario_fim) {
		this.horario_fim = horario_fim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAdministrador() {
		return administrador;
	}

	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}
	
	public long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getNumero_vagas() {
		return numero_vagas;
	}

	public void setNumero_vagas(int numero_vagas) {
		this.numero_vagas = numero_vagas;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public String getNumero_contato() {
		return numero_contato;
	}

	public void setNumero_contato(String numero_contato) {
		this.numero_contato = numero_contato;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
