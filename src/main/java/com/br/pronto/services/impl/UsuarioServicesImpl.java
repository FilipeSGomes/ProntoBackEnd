package com.br.pronto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.pronto.domain.Usuario;
import com.br.pronto.dto.UsuarioDto;
import com.br.pronto.mapper.UsuarioMapper;
import com.br.pronto.repository.UsuarioRepository;
import com.br.pronto.services.UsuarioServices;
/**
 * 
 * Classe que faz a implementacao da interface, e controla toda a regra de negocio do cliente
 * @author filipe.gomes.ext
 *
 */
@Service
public class UsuarioServicesImpl implements UsuarioServices{

	@Autowired
	private UsuarioRepository repository;

	@Autowired
	private UsuarioMapper mapper;

	@Override
	public List<UsuarioDto> readAllUsuario() {
		List<Usuario> listUsuario = (List<Usuario>) repository.findAll();
		return mapper.mapearListDto(listUsuario);
	}

	@Override
	public UsuarioDto readUsuarioId(Long idUsuario) {
		Usuario usuario = repository.findAllById(idUsuario);
		return mapper.mapear(usuario);
	}

	@Override
	public UsuarioDto readUsuarioCpf(String cpf) {
		Usuario usuario = repository.findAllByCpf(cpf);
		return mapper.mapear(usuario);
	}

	@Override
	public UsuarioDto createUsuario(UsuarioDto dto) {
		Usuario usuario = mapper.mapearCriacao(dto);
		usuario = repository.save(usuario);
		return mapper.mapear(usuario);
	}
}
