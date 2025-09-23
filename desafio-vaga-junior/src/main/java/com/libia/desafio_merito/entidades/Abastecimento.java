package com.libia.desafio_merito.entidades;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 *
 * @author libia
 */
@Entity //declara como entidade
@Data //cria construtor, getters e setters necessários
public class Abastecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne //define relação um pra muitos
    @JoinColumn(name = "bomba_id") //adiciona chave estrangeira
    private Bomba bomba;

    private LocalDateTime data;
    private Double litros;
    private Double valorTotal;
}
