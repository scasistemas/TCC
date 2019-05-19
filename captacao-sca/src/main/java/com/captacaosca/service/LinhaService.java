package com.captacaosca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captacaosca.domain.Linha;
import com.captacaosca.repository.LinhaRepository;


@Service
public class LinhaService {
	
	@Autowired private LinhaRepository linhaRepository;
	
	public Linha save(Linha linha) {
		Linha linhaCreatd=linhaRepository.save(linha);
		return linhaCreatd;
	}
	
	public List<Linha> list_all(String cod_motorista) {
		Optional<List<Linha>> linhas=linhaRepository.list_all(cod_motorista);
		return linhas.get();
	}

}
