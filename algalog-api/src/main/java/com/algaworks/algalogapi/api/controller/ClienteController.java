package com.algaworks.algalogapi.api.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalogapi.domain.model.Cliente;

/**
 * ClienteController
 */
@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        List<Cliente> teste = new ArrayList<Cliente>();
        return teste ;
    }

}
