package com.libia.desafio_merito.entidades;

import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author libia
 */
@Entity //declara como entidade
@Data //cria construtor, getters e setters necessários
public class Combustivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define valor da chave primária
    private Long id;
    private String nome;
    private Double precoPorLitro;
}
