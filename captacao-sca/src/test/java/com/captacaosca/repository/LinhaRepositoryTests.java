package com.captacaosca.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.captacaosca.domain.Linha;

@RunWith(SpringRunner.class) 
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest 
public class LinhaRepositoryTests {

	@Autowired private LinhaRepository linhaRepository;
	
	@Test
	public void AsaveTest() {
		String codigo="001";
		Linha linha = new Linha(Integer.valueOf(codigo), codigo, "BARREIRO / RIBEIRAO", null);
		linha.setDel(0);
		linha.setMotorista("001");
		Linha linhaCreated= linhaRepository.save(linha);
		assertThat(linhaCreated.getLincodigo().equalsIgnoreCase(codigo));
	}
}
