package com.captacaosca.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.captacaosca.domain.LancamentoId;
import com.captacaosca.domain.Lancamentos;
import com.captacaosca.domain.Motorista;

@RunWith(SpringRunner.class) /* Levantar os seus serviços automaticamente*/
@FixMethodOrder(MethodSorters.NAME_ASCENDING) /* Para que a ordem dos métodos a serem executados sejam de acordo com nome dos mesmos em ordem alfabética*/
@SpringBootTest /*Utilizar o contexto do projeto*/
public class LancamentoRepositoryTests {

	@Autowired private LancamentoRepository lancamentoRepository;
	
	@Test
	public void AsaveTest() {
		Motorista m= new Motorista();
		m.setCodigo("001");
		LancamentoId id = new LancamentoId("000001", "01", "001", new Date());
		Lancamentos lancamento = new Lancamentos(id, "0009", "08:00:00", 123, 1, 12,"001");
		Lancamentos lancamentoUser= lancamentoRepository.save(lancamento);
		assertThat(lancamentoUser.getId().getLaecodigo().equalsIgnoreCase("000001"));
	}
	
	@Test
	public void updateTest() {
		Motorista m= new Motorista();
		m.setCodigo("001");
		LancamentoId id = new LancamentoId("000001", "01", "001",new Date());
		Lancamentos lancamento = new Lancamentos(id, "0009", "10:00:00", 123, 1, 12,"001");
		Lancamentos lancamentoUser= lancamentoRepository.save(lancamento);
		assertThat(lancamentoUser.getLaehora().equalsIgnoreCase("09:00:00"));
	}
	
	
	
}
