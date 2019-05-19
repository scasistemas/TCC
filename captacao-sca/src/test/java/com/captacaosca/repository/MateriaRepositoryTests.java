package com.captacaosca.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.captacaosca.domain.Materia;

@RunWith(SpringRunner.class) 
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest 
public class MateriaRepositoryTests {
	
	@Autowired private MateriaRepository materiaRepository;
	
	
	@Test
	public void AsaveTest() {
		String codigo="001";
		Materia materia = new Materia(Integer.valueOf(codigo), codigo, "Leite Cru");
		materia.setDel(0);
		materia.setMotorista("001");
		Materia materiaCreated= materiaRepository.save(materia);
		assertThat(materiaCreated.getCodigo().equalsIgnoreCase(codigo));
	}

}
