package com.algaworks.algalogapi.api.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalogapi.domain.exception.NegocioException;
import com.algaworks.algalogapi.domain.model.Cliente;
import com.algaworks.algalogapi.domain.model.Entrega;
import com.algaworks.algalogapi.domain.model.StatusEntrega;
import com.algaworks.algalogapi.domain.repository.ClienteRepository;
import com.algaworks.algalogapi.domain.service.SolitacaoEntregaService;

import lombok.AllArgsConstructor;

/**
 * EntregaController
 */
@AllArgsConstructor
@RestController
@RequestMapping("/entregas")
public class EntregaController {
    private SolitacaoEntregaService solitacaoEntregaService;
    private ClienteRepository clienteRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Entrega solicitar(@RequestBody Entrega entrega) {
        return solitacaoEntregaService.solicitar(entrega);
    }
}