package com.captacaosca.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity(name="fazenda")
public class Fazenda extends Controle_Registros implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int _id;
	
	@EmbeddedId
	private FazendaId fazendaid;
	
	@MapsId("codigo")
	@JoinColumn(name="codigo", referencedColumnName="codigo")
	@ManyToOne
	public Produtor codigo;
	
	@Column(length=60,nullable=false)
	private String descri;
	
	private int sequencia;
	
	@ManyToOne
	@JoinColumn(name="codlinha",nullable = false)
	private Linha codlinha;
	
	
}
