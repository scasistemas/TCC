package com.captacaosca.domain;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter

@Entity(name="lancamentos")
public class Lancamentos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LancamentoId id;
	
	@Column(length=4,nullable= false)
	private String laelinha;
	
	@Column(length=10,nullable= false)
	private String laehora;
	
	@Column(nullable= false)
	private double laevolume;
	
	@Column(nullable= false)
	private int laentanque;
	
	@Column(nullable= false)
	private double laetemperatura;
	
	@Column(length=3,nullable= false)
	private String motorista;
	
	
}
