package com.captacaosca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captacaosca.domain.Lancamentos;
import com.captacaosca.repository.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired private LancamentoRepository lancamentoRepository;
	
	public Lancamentos save(Lancamentos lancamento) {
		Lancamentos createdLancamento=lancamentoRepository.save(lancamento);
		return createdLancamento;
	}
	
	public Lancamentos update(Lancamentos lancamento) {
		Lancamentos updatedLancamento=lancamentoRepository.save(lancamento);
		return updatedLancamento;
	}
	
	public List<Lancamentos> listAll(){
		List<Lancamentos> lancamentos=lancamentoRepository.findAll();
		return lancamentos;
	}
	
	public Optional<List<Lancamentos>> coletas(String data,String motorista){
		Optional<List<Lancamentos>> lancamentos=lancamentoRepository.coletas(data,motorista);
		return lancamentos;
	}

}
