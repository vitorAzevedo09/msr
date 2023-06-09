package com.algaworks.algalogapi.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.algaworks.algalogapi.domain.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;

/**
 * EntregaModel
 */
@Getter
@Setter
public class EntregaModel {

    private Long id;
    private ClienteResumoModel cliente;
    private DestinatarioModel destinatario;
    private BigDecimal taxa;
    private StatusEntrega status;
    private OffsetDateTime dataPedido;
    private OffsetDateTime dataFinalizacao;

}
