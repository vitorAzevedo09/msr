package com.algaworks.algalogapi.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.algaworks.algalogapi.api.model.EntregaModel;
import com.algaworks.algalogapi.api.model.input.EntregaInput;
import com.algaworks.algalogapi.domain.model.Entrega;

import lombok.AllArgsConstructor;

/**
 * EntregaAssembler
 */
@AllArgsConstructor
@Component
public class EntregaAssembler {

    private ModelMapper modelMapper;

    public EntregaModel toModel(Entrega entrega) {
        return modelMapper.map(entrega, EntregaModel.class);
    }

    public List<EntregaModel> toCollectionModel(List<Entrega> entregas) {
        return entregas.stream().map(this::toModel).collect(Collectors.toList());
    }

    public Entrega toEntity(EntregaInput entrega) {
        return modelMapper.map(entrega, Entrega.class);
    }
}
