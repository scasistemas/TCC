package com.captacaosca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captacaosca.domain.Materia;
import com.captacaosca.repository.MateriaRepository;


@Service
public class MateriaService {
	
	@Autowired private MateriaRepository materiaRepository;
	
	public Materia save(Materia materia) {
		Materia materiaCreatd=materiaRepository.save(materia);
		return materiaCreatd;
	}
	
	public List<Materia> list_all() {
		Optional<List<Materia>> materias=materiaRepository.list_all();
		return materias.get();
	}

}
