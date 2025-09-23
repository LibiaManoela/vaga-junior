/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libia.desafio_merito.entidades;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author libia
 */
@Data //cria construtor, getters e setters necessários
public class Abastecimento {
    private Long id;
    private Bomba bomba;
    private LocalDateTime data;
    private Double litros;
    private Double valorTotal;

    private static List<Abastecimento> abastecimentos = new ArrayList<>();

    public static List<Abastecimento> getAbastecimentos() {
        return abastecimentos;
    }
}
