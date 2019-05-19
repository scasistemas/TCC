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

import com.captacaosca.domain.Linha;
import com.captacaosca.service.LinhaService;

@RestController
@RequestMapping(value="linhas")
public class LinhaResource {

	@Autowired private LinhaService linhaService;
	
	@PostMapping
	public ResponseEntity<List<Linha>> save(@RequestBody  List<Linha> linhas){
		List<Linha> createdLinhas= new ArrayList<Linha>();
		for (Linha linha: linhas){
			Linha createdLinha =linhaService.save(linha);
			createdLinhas.add(createdLinha);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(createdLinhas);
	}
	
	@GetMapping ("/list-all/{id}")
	public ResponseEntity<List<Linha>> listAll(@PathVariable(name="id") String motorista){
		List<Linha> linhas =linhaService.list_all(motorista);
		return ResponseEntity.ok(linhas);
	}
}
