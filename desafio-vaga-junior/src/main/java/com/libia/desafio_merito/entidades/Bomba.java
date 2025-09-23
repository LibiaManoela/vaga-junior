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
    //teste mock
    public static void initializeMockData() {
        Combustivel combustivel1 = new Combustivel();
        combustivel1.setId(1L);
        combustivel1.setNome("Gasolina");
        combustivel1.setPrecoPorLitro(5.50);

        Bomba bomba1 = new Bomba();
        bomba1.setId(1L);
        bomba1.setNome("Bomba 1");
        bomba1.setTipoCombustivel(combustivel1);

        Bomba bomba2 = new Bomba();
        bomba2.setId(2L);
        bomba2.setNome("Bomba 2");
        bomba2.setTipoCombustivel(combustivel1);

        bombas.add(bomba1);
        bombas.add(bomba2);
    }

    //lambda para exibir resultados do teste mock
    public static void printBombas() {
        bombas.forEach(b -> System.out.println("ID: " + b.getId() + ", Nome: " + b.getNome() + ", Combustível: " + b.getTipoCombustivel().getNome()));
    }
}
