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

import com.captacaosca.domain.Motorista;
import com.captacaosca.service.MotoristaService;


@RestController
@RequestMapping(value="motoristas")
public class MotoristaResource {
	
	@Autowired private MotoristaService motoristaService;
	
	
	@PostMapping
	public ResponseEntity<List<Motorista>> save(@RequestBody  List<Motorista> motoristas){
		List<Motorista> createdMotoristas= new ArrayList<Motorista>();
		for (Motorista motorista: motoristas){
			Motorista createdMotorista =motoristaService.save(motorista);
			createdMotoristas.add(createdMotorista);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(createdMotoristas);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Motorista> getById(@PathVariable(name="id") String id){
		Motorista motorista =motoristaService.getById(id);
		return ResponseEntity.ok(motorista);
	}

}
