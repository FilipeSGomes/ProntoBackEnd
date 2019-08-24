package com.br.pronto.dto;

import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.br.CPF;
/**
 * Classe que cria objeto DTO, onde coloco todas as verificações de dados que virão da tela, passam por esse objeto
 * assim evitando que o front envie algo errrado e o backend processe
 * @author filipe.gomes.ext
 *
 */
public class UsuarioDto {

	private String palavraSeguranca;
	
	@Email
	private String login;

	private String senha;
	
	@CPF
	private String cpf;

	public String getPalavraSeguranca() {
		return palavraSeguranca;
	}

	public void setPalavraSeguranca(String palavraSeguranca) {
		this.palavraSeguranca = palavraSeguranca;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
