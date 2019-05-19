package com.captacaosca.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.captacaosca.domain.Fazenda;
import com.captacaosca.service.FazendaService;


@RestController
@RequestMapping(value="fazendas")
public class FazendaResource {

	@Autowired private FazendaService fazendaService;
	
	@PostMapping
	public ResponseEntity<List<Fazenda>> save(@RequestBody  List<Fazenda> fazendas){
		List<Fazenda> createdFazendas= new ArrayList<Fazenda>();
		for (Fazenda fazenda: fazendas){
			Fazenda createdFazenda =fazendaService.save(fazenda);
			createdFazendas.add(createdFazenda);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(createdFazendas);
	}
	
	@GetMapping ("/list-all/{id}")
	public ResponseEntity<List<Fazenda>> listAll(@PathVariable(name="id") String motorista){
		List<Fazenda> fazendas =fazendaService.list_all(motorista);
		return ResponseEntity.ok(fazendas);
	}
}
