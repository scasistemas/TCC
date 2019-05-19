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

import com.captacaosca.domain.Materia;
import com.captacaosca.service.MateriaService;

@RestController
@RequestMapping(value="materias")
public class MateriaResource {
	
	@Autowired private MateriaService materiaService;
	
	@PostMapping
	public ResponseEntity<List<Materia>> save(@RequestBody  List<Materia> materias){
		List<Materia> createdMaterias= new ArrayList<Materia>();
		for (Materia materia: materias){
			Materia createdMateria =materiaService.save(materia);
			createdMaterias.add(createdMateria);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(createdMaterias);
	}
	
	@GetMapping ("/list-all/")
	public ResponseEntity<List<Materia>> listAll(){
		List<Materia> materias =materiaService.list_all();
		return ResponseEntity.ok(materias);
	}

}
