package com.br.pronto.mapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.br.pronto.domain.Usuario;
import com.br.pronto.dto.UsuarioDto;

@Component
public class UsuarioMapper {

	public List<UsuarioDto> mapearListDto(List<Usuario> lsUsuario){
		List<UsuarioDto> lsUsuarioDto = new ArrayList<UsuarioDto>();
		for(Usuario usuario : lsUsuario) {
			lsUsuarioDto.add(mapear(usuario));
		}
		return lsUsuarioDto;
	}
	
	public Usuario mapearAlteracao(UsuarioDto dto) {
		Usuario usuario = new Usuario();

		usuario.setCpf(dto.getCpf());
		usuario.setLogin(dto.getLogin());
		usuario.setPalavraSeguranca(dto.getPalavraSeguranca());
		usuario.setSenha(dto.getSenha());
		usuario.setDtUpdate(LocalDate.now());
		return usuario;
	}

	public Usuario mapearCriacao(UsuarioDto dto) {
		Usuario usuario = new Usuario();

		usuario.setCpf(dto.getCpf());
		usuario.setLogin(dto.getLogin());
		usuario.setPalavraSeguranca(dto.getPalavraSeguranca());
		usuario.setSenha(dto.getSenha());
		usuario.setDtCreate(LocalDate.now());
		return usuario;
	}

	public UsuarioDto mapear(Usuario usuario) {
		UsuarioDto dto = new UsuarioDto();

		dto.setCpf(usuario.getCpf());
		dto.setLogin(usuario.getLogin());
		dto.setPalavraSeguranca(usuario.getPalavraSeguranca());
		dto.setSenha(usuario.getSenha());
		return dto;
	}

}