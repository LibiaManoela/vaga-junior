package com.libia.desafio_merito.entidades;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *
 * @author libia
 */
@Data //cria construtor, getters e setters necessários
public class Abastecimento {
    private Long id;
    private Bomba bomba;
    
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss") //formatação da data
    private LocalDateTime data;
    private Double litros;
    private Double valorTotal;

    private static List<Abastecimento> abastecimentos = new ArrayList<>();

    public static List<Abastecimento> getAbastecimentos() {
        return abastecimentos;
    }
    
    //teste mock
    public static void initializeMockData() {
        Bomba bomba1 = new Bomba();
        bomba1.setId(1L);
        bomba1.setNome("Bomba 1");
        Combustivel combustivel1 = new Combustivel();
        combustivel1.setId(1L);
        combustivel1.setNome("Gasolina comum");
        combustivel1.setPrecoPorLitro(5.50);
        bomba1.setTipoCombustivel(combustivel1);

        Abastecimento abastecimento1 = new Abastecimento();
        abastecimento1.setId(1L);
        abastecimento1.setBomba(bomba1);
        abastecimento1.setData(LocalDateTime.now());
        abastecimento1.setLitros(20.0);
        abastecimento1.setValorTotal(20.0 * 5.50);

        Abastecimento abastecimento2 = new Abastecimento();
        abastecimento2.setId(2L);
        abastecimento2.setBomba(bomba1);
        abastecimento2.setData(LocalDateTime.now().minusDays(1));
        abastecimento2.setLitros(15.0);
        abastecimento2.setValorTotal(15.0 * 5.50);

        abastecimentos.add(abastecimento1);
        abastecimentos.add(abastecimento2);
    }

    //lambda para exibir resultados do teste mock
    public static void printAbastecimentos() {
        abastecimentos.forEach(a -> System.out.println("ID: " + a.getId() + ", Bomba: " + a.getBomba().getNome() + ", Data: " + a.getData() + ", Litros: " + a.getLitros() + ", Valor Total: " + a.getValorTotal()));
    }
}
