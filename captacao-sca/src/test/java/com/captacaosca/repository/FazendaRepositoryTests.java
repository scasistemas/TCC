package com.captacaosca.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.captacaosca.domain.Fazenda;
import com.captacaosca.domain.FazendaId;
import com.captacaosca.domain.Linha;
import com.captacaosca.domain.Produtor;

@RunWith(SpringRunner.class) 
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest 
public class FazendaRepositoryTests {

	@Autowired private FazendaRepository fazendaRepository;
	
	@Test
	public void AsaveTest() {
		String cod_produtor="001408";
		Produtor p= new Produtor();
		p.setCodigo(cod_produtor);
		FazendaId fazendaid= new FazendaId("01", cod_produtor);
		
		String lincodigo="0002";
		Linha l = new Linha(Integer.valueOf(lincodigo), lincodigo, "", null);
		
		String fazenda="01";
		
		Fazenda f = new Fazenda(Integer.valueOf(fazenda), fazendaid, p, "Fazenda do x", 1, l);
		f.setDel(0);
		f.setMotorista("001");
		Fazenda fazendaCreated= fazendaRepository.save(f);
		assertThat(fazendaCreated.getCodigo().getCodigo().equalsIgnoreCase(cod_produtor));
	}
}
