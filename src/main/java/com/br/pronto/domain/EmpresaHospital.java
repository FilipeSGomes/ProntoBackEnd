package com.br.pronto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.br.pronto.uteis.Domains;
@Table 
@Entity(name="EMPRESA_HOSPITAL")
public class EmpresaHospital extends Domains{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name= "ID_EMPRESA_HOSPITAL")
	private int id;
	
	@Column(name = "ID_EMPRESA")
	private Empresa empresa;
	
	@Column(name = "ID_HOSPITAL")
	private Hospital hospital;

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

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public EmpresaHospital(int id, Empresa empresa, Hospital hospital) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.hospital = hospital;
	}
}
