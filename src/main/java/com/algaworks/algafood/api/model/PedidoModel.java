package com.algaworks.algafood.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PedidoModel { //DTO

	 private String codigo;
	 private BigDecimal subtotal;
	 private BigDecimal taxaFrete;
	 private BigDecimal valorTotal;
	 private String status;
	 private OffsetDateTime dataCriacao;
	 private OffsetDateTime dataConfirmacao;
	 private OffsetDateTime dataEntrega;
	 private OffsetDateTime dataCancelamento;
	 private RestauranteResumoModel restaurante;
	 private UsuarioModel cliente;
	 private FormaPagamentoModel enderecoEntrega;
	 private List<ItemPedidoModel> itens;
	
}
