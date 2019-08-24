package com.br.pronto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.br.pronto.uteis.Domains;


/**
 * <h1> Classe responsavel pelos dados da entidade Hospital </h1>
 * @author filipe.gomes
 * @since 07-08-2019
 */
@Table
@Entity(name = "HOSPITAL")
public class Hospital extends Domains{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_HOSPITAL")
	private int id;
	
	@Column(name = "NM_HOSPITAL")
	private String nmHospital;
	
	@Column(name = "ENDERECO")
	private String endHospital;
	
	@Column(name = "ESPECIALIDADE")
	private String especialidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNmHospital() {
		return nmHospital;
	}

	public void setNmHospital(String nmHospital) {
		this.nmHospital = nmHospital;
	}

	public String getEndHospital() {
		return endHospital;
	}

	public void setEndHospital(String endHospital) {
		this.endHospital = endHospital;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", nmHospital=" + nmHospital + ", endHospital=" + endHospital + ", especialidade="
				+ especialidade + "]";
	}

	public Hospital(int id, String nmHospital, String endHospital, String especialidade) {
		super();
		this.id = id;
		this.nmHospital = nmHospital;
		this.endHospital = endHospital;
		this.especialidade = especialidade;
	}
}
