package com.captacaosca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captacaosca.domain.Produtor;
import com.captacaosca.repository.ProdutorRepository;

@Service
public class ProdutorService {

	@Autowired private ProdutorRepository produtorRepository;
	
	public Produtor save(Produtor produtor) {
		Produtor produtorCreatd=produtorRepository.save(produtor);
		return produtorCreatd;
	}
	
	public List<Produtor> list_all(String cod_motorista) {
		Optional<List<Produtor>> produtores=produtorRepository.list_all(cod_motorista);
		return produtores.get();
	}
	
}
