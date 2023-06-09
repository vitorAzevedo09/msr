package com.algaworks.algalogapi.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.groups.ConvertGroup;
import javax.validation.groups.Default;

import com.algaworks.algalogapi.domain.ValidationGroups;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.core.JsonToken;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Entrega
 */
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Entrega {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Valid
    @ConvertGroup(from = Default.class, to = ValidationGroups.ClientId.class)
    @NotNull
    @ManyToOne
    private Cliente cliente;

    @Valid
    @NotNull
    @Embedded
    private Destinatario destinatario;

    @Valid
    @NotNull
    private BigDecimal taxa;

    @Enumerated(EnumType.STRING)
    @JsonProperty(access = Access.READ_ONLY)
    private StatusEntrega status;

    @JsonProperty(access = Access.READ_ONLY)
    private OffsetDateTime dataPedido;

    @JsonProperty(access = Access.READ_ONLY)
    private OffsetDateTime dataFinalizacao;
}
