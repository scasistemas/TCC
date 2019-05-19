package com.captacaosca.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter

@Entity(name="motorista")
public class Motorista implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int _id;
	
	@Id
	@Column(length=3,nullable= false)
	private String codigo;
	
	@Column(length=50,nullable= false)
	private String nome;
	
	@Column(length=200,nullable= false)
	private String endereco;
	
	@Column(length=50,nullable= false)
	private String login;
	
	@Column(length=50,nullable= false)
	private String senha;
	
	@Column(length=20,nullable= false)
	private String emp;
	
	@Column(length=50,nullable= false)
	private String logindrive;
	
	@Getter(onMethod = @__({@JsonIgnore}))
	@OneToMany(mappedBy="motorista")
	private List<Lancamentos> lancamentos= new ArrayList<Lancamentos>();
	
	
}