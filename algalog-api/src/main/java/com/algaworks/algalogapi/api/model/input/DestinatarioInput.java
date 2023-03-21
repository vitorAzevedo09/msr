package com.algaworks.algalogapi.api.model.input;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

/**
 * DestinatarioInput
 */
@Getter
@Setter
public class DestinatarioInput {

    @NotBlank
    private String nome;

    @NotBlank
    private String logradouro;

    @NotBlank
    private String numero;

    @NotBlank
    private String complemento;

    @NotBlank
    private String bairro;
    
}
