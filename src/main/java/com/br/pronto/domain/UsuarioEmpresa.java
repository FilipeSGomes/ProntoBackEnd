package com.br.pronto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.br.pronto.uteis.Domains;

@Table 
@Entity(name="USUARIO_EMPRESA")
public class UsuarioEmpresa extends Domains{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name ="ID_USUARIO_EMPRESA")
	private int id;
	
	@Column(name="ID_EMPRESA")
	private Empresa empresa;

	@Column(name="ID_USUARIO")
	private Usuario usuario;

	@Column(name="NR_CARTEIRA")
	private String nrCarteira;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String getNrCarteira() {
		return nrCarteira;
	}

	public void setNrCarteira(String nrCarteira) {
		this.nrCarteira = nrCarteira;
	}

	public UsuarioEmpresa() {
		//CONSTRUTOR PADRAO
		super();
	}
	
}
