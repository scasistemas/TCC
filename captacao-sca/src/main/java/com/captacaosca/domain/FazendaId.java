package com.captacaosca.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Embeddable
public class FazendaId implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fazenda;
	private String codigo;
}
