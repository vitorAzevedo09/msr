package com.algaworks.algalogapi.api.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * EntregaInput
 */
@Getter
@Setter
public class EntregaInput {

    @Valid
    @NotNull
    private ClienteIdInput cliente;

    @Valid
    @NotNull
    private DestinatarioInput Destinatario;

    @NotNull
    private BigDecimal taxa;
}
