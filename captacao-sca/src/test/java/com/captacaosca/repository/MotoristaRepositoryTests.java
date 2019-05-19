package com.captacaosca.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.captacaosca.domain.Motorista;

@RunWith(SpringRunner.class) 
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest 
public class MotoristaRepositoryTests {

	@Autowired private MotoristaRepository motoristaRepository;
	
	@Test
	public void AsaveTest() {
		String codigo="001";
		Motorista motorista = new Motorista( Integer.parseInt(codigo), codigo, "Gustavo", "Endereco", "Gustavo", "123", "SCA", "", null);
		Motorista motoristaCreated= motoristaRepository.save(motorista);
		assertThat(motoristaCreated.getCodigo().equalsIgnoreCase(codigo));
	}
	
	
}
