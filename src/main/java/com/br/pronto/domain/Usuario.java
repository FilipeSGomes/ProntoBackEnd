package com.br.pronto.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.br.pronto.uteis.Domains;
/**
 * Classe de entitade que define os campos que tenho no banco e que usarei no sitema
 * @author filipe.gomes.ext
 *
 */
@Table
@Entity(name= "USUARIO")
public class Usuario extends Domains{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_USUARIO")
	private int id;
	
	@Column(name="DS_SENHA")
	private String senha;
	
	@Column(name="DS_LOGIN")
	private String login;
	
	@Column(name="PALAVRA_SEGURANCA")
	private String palavraSeguranca;

	@Column(name="DS_CPF")
	private String cpf;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPalavraSeguranca() {
		return palavraSeguranca;
	}

	public void setPalavraSeguranca(String palavraSeguranca) {
		this.palavraSeguranca = palavraSeguranca;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Usuario() {
		super();
		// CONSTRUTOR PADRAO 
	}
	
	
}
