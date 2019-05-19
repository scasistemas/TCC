package com.captacaosca.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.captacaosca.domain.Linha;


@Repository
public interface LinhaRepository  extends JpaRepository<Linha,String> {
	
	@Query("SELECT p FROM linha p WHERE motorista = ?1 and del = 0")
	public Optional<List<Linha>> list_all(String motorista);

}
