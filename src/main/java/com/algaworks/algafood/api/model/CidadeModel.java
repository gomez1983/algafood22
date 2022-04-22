package com.algaworks.algafood.api.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CidadeModel { //DTO

	private Long id;
	private String nome;
	private EstadoModel estado;	
}