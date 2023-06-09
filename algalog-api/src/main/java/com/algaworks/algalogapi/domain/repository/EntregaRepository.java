package com.algaworks.algalogapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algalogapi.domain.model.Entrega;

/**
 * EntregaRepository
 */
@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long>{
}
