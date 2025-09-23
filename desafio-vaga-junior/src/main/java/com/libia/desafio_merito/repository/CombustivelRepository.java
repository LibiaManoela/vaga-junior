package com.libia.desafio_merito.repository;

import com.libia.desafio_merito.entidades.Combustivel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author libia
 */
public interface CombustivelRepository  extends JpaRepository<Combustivel, Long> {
}