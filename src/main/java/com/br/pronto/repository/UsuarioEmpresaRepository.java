package com.br.pronto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.pronto.domain.UsuarioEmpresa;
@Repository
public interface UsuarioEmpresaRepository extends CrudRepository<UsuarioEmpresa, Long>{

}
