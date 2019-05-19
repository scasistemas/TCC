package com.captacaosca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.captacaosca.domain.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista,String> {

}
