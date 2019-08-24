package com.br.pronto.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.pronto.dto.UsuarioDto;
import com.br.pronto.services.UsuarioServices;

/**
 * Classe responsavel por ser o controller, definir acesso e nomeclatura para url.
 * criacao dos endpoints e metodos usados
 * 
 * @author filipe.gomes
 *
 */
@RestController
//@Api(value = "Usuario")
public class UsuarioController {
	
	@Autowired 
	UsuarioServices services;
	
	
//	@ApiOperation(value = "Greets the world or Niteroi")
//	  @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	
	@RequestMapping(method = GET, value = "/dadosUsuario")
	public List<UsuarioDto> readAllUsuario() {
		return services.readAllUsuario();
	}
	
	@RequestMapping(method = GET, value = "/dadosUsuario/{id}")
	public UsuarioDto readUsuario(@PathVariable Long id) {
		return services.readUsuarioId(id);
	}

	@RequestMapping(method = GET, value = "/dadosUsuario/{cpf}")
	public UsuarioDto readUsuarioPorCpf(@PathVariable String cpf) {
		return services.readUsuarioCpf(cpf);
	}
	
	@RequestMapping(method = POST, value = "/dadosUsuario/")
	public UsuarioDto createUsuario(UsuarioDto usuarioDto) {
		return services.createUsuario(usuarioDto);
	}
	
}