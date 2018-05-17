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
	
	@Column
	private String nome;
	
	@Column
	private String data;
	
	@Column
	private String local;
	
	@Column
	private String horario_inicio;
	
	@Column
	private String horario_fim;
	
	@Column
	private String descricao;
	
	@Column
	private String descricao_extra;
	
	@Column
	private long id_categoria;
	
	@Column
	private int numero_vagas;
	
	@Column
	private String nome_contato;
	
	@Column
	private String numero_contato;
	
	@Column
	private String segundo_nome_contato;
	
	@Column
	private String segundo_numero_contato;
	
	@Column
	private String terceiro_nome_contato;
	
	@Column
	private String terceiro_numero_contato;
	
	@Column
	private int id_estado;
	
	@Column
	private String gerenciador;
	
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

	public String getGerenciador() {
		return gerenciador;
	}

	public void setGerenciador(String gerenciador) {
		this.gerenciador = gerenciador;
	}

	public String getDescricao_extra() {
		return descricao_extra;
	}

	public void setDescricao_extra(String descricao_extra) {
		this.descricao_extra = descricao_extra;
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

	public String getSegundo_nome_contato() {
		return segundo_nome_contato;
	}

	public void setSegundo_nome_contato(String segundo_nome_contato) {
		this.segundo_nome_contato = segundo_nome_contato;
	}

	public String getSegundo_numero_contato() {
		return segundo_numero_contato;
	}

	public void setSegundo_numero_contato(String segundo_numero_contato) {
		this.segundo_numero_contato = segundo_numero_contato;
	}

	public String getTerceiro_nome_contato() {
		return terceiro_nome_contato;
	}

	public void setTerceiro_nome_contato(String terceiro_nome_contato) {
		this.terceiro_nome_contato = terceiro_nome_contato;
	}

	public String getTerceiro_numero_contato() {
		return terceiro_numero_contato;
	}

	public void setTerceiro_numero_contato(String terceiro_numero_contato) {
		this.terceiro_numero_contato = terceiro_numero_contato;
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
