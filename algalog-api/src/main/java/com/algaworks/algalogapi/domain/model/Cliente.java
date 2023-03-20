package com.algaworks.algalogapi.domain.model;

import javax.validation.constraints.*;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Cliente
 */

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 60)
    private String nome;

    @Size(max = 255)
    @Email
    @NotBlank
    private String email;

    @Size(max = 20)
    @NotBlank
    private String telefone;

    public void setId(Long id) {
        this.id = id;
    }

}
