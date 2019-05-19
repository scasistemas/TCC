package com.captacaosca.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.captacaosca.domain.Materia;


@Repository
public interface MateriaRepository  extends JpaRepository<Materia,String> {
	
	@Query("SELECT p FROM materia p where del = 0")
	public Optional<List<Materia>> list_all();

}
