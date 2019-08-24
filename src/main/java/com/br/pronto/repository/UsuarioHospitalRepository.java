package com.br.pronto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.pronto.domain.UsuarioHospital;

@Repository
public interface UsuarioHospitalRepository extends CrudRepository<UsuarioHospital,Long>{

}
