

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
@Entity(name="produtor")
public class  Produtor extends Controle_Registros implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int _id;
	
	@Id
	@Column(name = "codigo",length=6,nullable= false)
	private String codigo;
	
	@Column(length=50,nullable= false)
	private String nome;
	
	@Getter(onMethod = @__({@JsonIgnore}))
	@OneToMany(mappedBy="codigo")
	private List<Fazenda> fazendas= new ArrayList<Fazenda>();
}







