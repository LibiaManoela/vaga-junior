/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libia.desafio_merito.entidades;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author libia
 */
@Data //cria construtor, getters e setters necessários
public class Combustivel {
    private Long id;
    private String nome;
    private Double precoPorLitro;

    private static List<Combustivel> combustiveis = new ArrayList<>();

    public static List<Combustivel> getCombustiveis() {
        return combustiveis;
    }
}
