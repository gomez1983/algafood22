package com.algaworks.algafood.domain.model;

import java.util.Arrays;
import java.util.List;

public enum StatusPedido {
 
	CRIADO("Criado"),
    CONFIRMADO("Confirmado", CRIADO), // "CRIADO" significa que a mudança deste status "CONFIRMADO" só pode ocorrer a partir do status "CRIADO".
    ENTREGUE("Entregue", CONFIRMADO),// "CONFIRMADO" significa que a mudança deste status "ENTREGUE" só pode ocorrer a partir do status "CONFIRMADO".
    CANCELADO("Cancelado", CRIADO);// "CRIADO" significa que a mudança deste status "CANCELADO" só pode ocorrer a partir do status "CRIADO".
    
    private String descricao;
    private List<StatusPedido> statusAnteriores;
	
	StatusPedido(String descricao, StatusPedido... statusAnteriores) {
		this.descricao = descricao;
		this.statusAnteriores = Arrays.asList(statusAnteriores);
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public boolean naoPodeAlterarPara(StatusPedido novoStatus) { //Método que diz se pode ou não transitar entre as instâncias de Status
		return !novoStatus.statusAnteriores.contains(this);
	}
}