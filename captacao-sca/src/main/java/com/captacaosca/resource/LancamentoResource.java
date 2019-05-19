package com.captacaosca.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.captacaosca.domain.Lancamentos;
import com.captacaosca.service.LancamentoService;

@RestController
@RequestMapping(value="lancamentos")
public class LancamentoResource {

	@Autowired private LancamentoService lancamentoService;
	
	@PostMapping
	public ResponseEntity<List<Lancamentos>> save(@RequestBody List<Lancamentos> lancamentos){
		List<Lancamentos> createdLancamentos= new ArrayList<Lancamentos>();
		for (Lancamentos lancamento: lancamentos){
			Lancamentos createdLancamento =lancamentoService.save(lancamento);
			createdLancamentos.add(createdLancamento);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(createdLancamentos);
	}
	
	/*@PostMapping
	public ResponseEntity<Lancamentos> save(@RequestBody Lancamentos lancamento){
		Lancamentos createdLancamento =lancamentoService.save(lancamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdLancamento);
	}*/
	
	
	@PutMapping
	public ResponseEntity<List<Lancamentos>> update(@RequestBody List<Lancamentos> lancamentos){
		List<Lancamentos> createdLancamentos= new ArrayList<Lancamentos>();
		for (Lancamentos lancamento: lancamentos){
			Lancamentos createdLancamento =lancamentoService.save(lancamento);
			createdLancamentos.add(createdLancamento);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(createdLancamentos);
	}
	
	/* Listar sem lazy loading */
	@GetMapping ("/list-all")
	public ResponseEntity<List<Lancamentos>> listAll(){
		List<Lancamentos> lancamentos =lancamentoService.listAll();
		return ResponseEntity.ok(lancamentos);
	}
	
	@GetMapping ("/coletas")
	public ResponseEntity<Optional<List<Lancamentos>>> coletas(
			@RequestParam(value="data",defaultValue ="1900-01-01") String data, 
			@RequestParam(value="motorista",defaultValue ="001") String motorista){
		Optional<List<Lancamentos>> lancamentos =lancamentoService.coletas(data, motorista);
		return ResponseEntity.ok(lancamentos);
	}
	
}