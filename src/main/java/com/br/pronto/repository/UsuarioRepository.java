package com.br.pronto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.pronto.domain.Usuario;
/**
 * interface repsonsavel por fazer toda a consulta com banco de dados
 * @author filipe.gomes.ext
 *
 */
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	public Usuario findAllById(Long id);

	@Query("SELECT u FROM Usuario u WHERE u.cpf =:cpf")
	public Usuario findAllByCpf(String cpf);
}

