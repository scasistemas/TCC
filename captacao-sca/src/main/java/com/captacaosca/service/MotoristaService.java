package com.captacaosca.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captacaosca.domain.Motorista;
import com.captacaosca.repository.MotoristaRepository;

@Service
public class MotoristaService {

	@Autowired private MotoristaRepository motoristaRepository;
	
	public Motorista save(Motorista motorista) {
		Motorista motoristaCreatd=motoristaRepository.save(motorista);
		return motoristaCreatd;
	}
	
	public  Motorista getById(String id) {
		Optional<Motorista> result= motoristaRepository.findById(id);
		return result.get();
	}
	
}