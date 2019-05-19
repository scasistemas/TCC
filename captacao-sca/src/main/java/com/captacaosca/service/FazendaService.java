package com.captacaosca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captacaosca.domain.Fazenda;
import com.captacaosca.repository.FazendaRepository;

@Service
public class FazendaService {
	@Autowired private FazendaRepository fazendaRepository;
	
	
	public Fazenda save(Fazenda fazenda) {
		Fazenda fazendaCreatd=fazendaRepository.save(fazenda);
		return fazendaCreatd;
	}
	
	public List<Fazenda> list_all(String cod_motorista) {
		Optional<List<Fazenda>> fazendas=fazendaRepository.list_all(cod_motorista);
		return fazendas.get();
	}

}
