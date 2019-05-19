package com.captacaosca.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.captacaosca.domain.Produtor;

@Repository
public interface ProdutorRepository extends JpaRepository<Produtor,String> {

	@Query("SELECT p FROM produtor p WHERE motorista = ?1 and del = 0")
	public Optional<List<Produtor>> list_all(String motorista);
}
