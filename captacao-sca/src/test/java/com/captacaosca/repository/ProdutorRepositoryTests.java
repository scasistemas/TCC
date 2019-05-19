package com.captacaosca.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.captacaosca.domain.Produtor;


@RunWith(SpringRunner.class) 
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest 
public class ProdutorRepositoryTests {

	@Autowired private ProdutorRepository produtorRepository;
	
	@Test
	public void AsaveTest() {
		String codigo ="001407";
		Produtor produtor = new Produtor(Integer.parseInt(codigo), codigo, "JOSE ORLANDO DE A. CARVALHO"   ,  null);
		produtor.setDel(0);
		produtor.setMotorista("001");
		Produtor produtorCreated= produtorRepository.save(produtor);
		assertThat(produtorCreated.getCodigo().equalsIgnoreCase(codigo));
	}
}
