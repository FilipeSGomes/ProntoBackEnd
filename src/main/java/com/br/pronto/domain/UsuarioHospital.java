package com.br.pronto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.br.pronto.uteis.Domains;

@Table
@Entity(name= "USUARIO_HOSPITAL")
public class UsuarioHospital extends Domains{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name= "ID_USUARIO_HOSPITAL")
	private int id;
	
	@Column(name="ID_HOSPITAL")
	private Hospital hospital;
	
	@Column(name="ID_USUARIO")
	private Usuario usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioHospital() {
		super();
		// CONSTRUTOR PADRAO
	}
	
}
