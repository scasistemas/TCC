package com.captacaosca.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Embeddable
public class LancamentoId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String laecodigo;
	private String laefazenda;
	private String laemateria;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date laedata;
	
}
