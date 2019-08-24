package com.br.pronto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.br.pronto.uteis.Domains;

@Table 
@Entity(name= "EMPRESA")
public class Empresa extends Domains{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_EMRESA")
	private int id;

	@Column(name = "NM_EMPRESA")
	private String nmEmpresa;

	@Column(name = "CNPJ_EMPRESA")
	private String cnpj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNmEmpresa() {
		return nmEmpresa;
	}

	public void setNmEmpresa(String nmEmpresa) {
		this.nmEmpresa = nmEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Empresa() {
		super();
		// CONSTRUTOR PADRAO
	}
	
	
}