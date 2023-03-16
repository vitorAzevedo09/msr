package com.algaworks.algalogapi.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * Cliente
 */

@Getter
@Setter
@Entity
public class Cliente {

    @Id
    private Long id;
    private String nome;
    private String email;
    private String telefone;

}
