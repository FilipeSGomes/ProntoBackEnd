package com.br.pronto.uteis;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
/**
 * 
 * <h1>Classe de Domains padrao</h1>
 * <p> adicionando campos de Data de Criação e alteracao para cada dominio </p>
 * @author filipe.gomes
 * @since 07-08-19
 */

public class Domains implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "DT_CREATE")
	private LocalDate dtCreate;
	
	@Column(name = "DT_UPDATE")
	private LocalDate dtUpdate;

	public LocalDate getDtCreate() {
		return dtCreate;
	}

	public void setDtCreate(LocalDate dtCreate) {
		this.dtCreate = dtCreate;
	}

	public LocalDate getDtUpdate() {
		return dtUpdate;
	}

	public void setDtUpdate(LocalDate dtUpdate) {
		this.dtUpdate = dtUpdate;
	}
	
	public Domains() {
		//Metodo padrão Construtor
	};
	
}
