package com.br.pronto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.pronto.domain.EmpresaHospital;

@Repository
public interface EmpresaHospitalRepository extends CrudRepository<EmpresaHospital, Long>{

}
