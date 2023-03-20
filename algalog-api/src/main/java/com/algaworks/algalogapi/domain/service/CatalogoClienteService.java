package com.algaworks.algalogapi.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algalogapi.domain.exception.NegocioException;
import com.algaworks.algalogapi.domain.model.Cliente;
import com.algaworks.algalogapi.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;

/**
 * CatalogoClienteService
 */
@AllArgsConstructor
@Service
public class CatalogoClienteService {
    private ClienteRepository clienteRepository;

    @Transactional
    public Cliente salvar(Cliente cliente) {
        boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail()).stream().anyMatch(c -> !c.equals(cliente))
        if(emailEmUso){
            throw new NegocioException("Já existe um usuário cadastrado com esse e-mail.")
        }
        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir(Long clienteId) {
        return clienteRepository.deleteById(clienteId);
    }

}
