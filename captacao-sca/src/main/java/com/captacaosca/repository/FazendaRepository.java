package com.captacaosca.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.captacaosca.domain.Fazenda;
import com.captacaosca.domain.FazendaId;

@Repository
public interface FazendaRepository extends JpaRepository<Fazenda,FazendaId> {
	
	@Query("SELECT p FROM fazenda p WHERE motorista = ?1 and del = 0")
	public Optional<List<Fazenda>> list_all(String motorista);

}
