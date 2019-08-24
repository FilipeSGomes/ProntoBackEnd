package com.br.pronto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.pronto.domain.Hospital;

@Repository
public interface HospitalRepository extends CrudRepository<Hospital, Long>{

}
