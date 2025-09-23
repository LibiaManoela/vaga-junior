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
public class Bomba {
    private Long id;
    private String nome;
    private Combustivel tipoCombustivel;

    private static List<Bomba> bombas = new ArrayList<>();

    public static List<Bomba> getBombas() {
        return bombas;
    }
}
