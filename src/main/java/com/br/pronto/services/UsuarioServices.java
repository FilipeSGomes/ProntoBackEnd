package com.br.pronto.services;

import java.util.List;

import com.br.pronto.dto.UsuarioDto;
/**
 * Interface responsável pelos servicos que são disponibilizados 
 * para a camada de Controller e tambem para outras classes de servicos
 * @author filipe.gomes.ext
 *
 */
public interface UsuarioServices {

	public List<UsuarioDto> readAllUsuario();
	
	public UsuarioDto readUsuarioId(Long idUsuario);

	public UsuarioDto readUsuarioCpf(String cpf);

	public UsuarioDto createUsuario(UsuarioDto dto);
}
