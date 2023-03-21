package com.algaworks.algalogapi.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalogapi.api.assembler.EntregaAssembler;
import com.algaworks.algalogapi.api.model.EntregaModel;
import com.algaworks.algalogapi.api.model.input.EntregaInput;
import com.algaworks.algalogapi.domain.exception.NegocioException;
import com.algaworks.algalogapi.domain.model.Cliente;
import com.algaworks.algalogapi.domain.model.Entrega;
import com.algaworks.algalogapi.domain.model.StatusEntrega;
import com.algaworks.algalogapi.domain.repository.ClienteRepository;
import com.algaworks.algalogapi.domain.repository.EntregaRepository;
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
    private EntregaAssembler entregaAssembler;
    private EntregaRepository entregaRepository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public EntregaModel solicitar(@Valid @RequestBody EntregaInput entrega) {
        Entrega novaEntrega = entregaAssembler.toEntity(entrega);
        Entrega entregaSolicitada = solitacaoEntregaService.solicitar(novaEntrega);
        return entregaAssembler.toModel(entregaSolicitada);
    }

    @GetMapping
    public List<EntregaModel> listar() {
        return entregaAssembler.toCollectionModel(
                entregaRepository.findAll());
    }

    public ResponseEntity<EntregaModel> buscar(Long id) {
        return entregaRepository.findById(id)
                .map(entrega -> ResponseEntity.ok(entregaAssembler.toModel(entrega)))
                .orElse(ResponseEntity.notFound().build());
    }
}
