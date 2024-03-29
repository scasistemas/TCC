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

import com.captacaosca.domain.Produtor;
import com.captacaosca.service.ProdutorService;

@RestController
@RequestMapping(value="produtores")
public class ProdutorResource {

	@Autowired private ProdutorService produtorService;
	
	@PostMapping
	public ResponseEntity<List<Produtor>> save(@RequestBody  List<Produtor> produtores){
		List<Produtor> createdProdutores= new ArrayList<Produtor>();
		for (Produtor produtor: produtores){
			Produtor createdProdutor =produtorService.save(produtor);
			createdProdutores.add(createdProdutor);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(createdProdutores);
	}
	
	@GetMapping ("/list-all/{id}")
	public ResponseEntity<List<Produtor>> listAll(@PathVariable(name="id") String motorista){
		List<Produtor> produtores =produtorService.list_all(motorista);
		return ResponseEntity.ok(produtores);
	}
	
	
}
