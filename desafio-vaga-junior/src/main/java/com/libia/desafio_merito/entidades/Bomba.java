package com.libia.desafio_merito.entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @author libia
 */
@Entity //declara como entidade
@Data //cria construtor, getters e setters necessários
public class Bomba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define valor da chave primária
    private Long id;
    private String nome;

    @ManyToOne //define relação um pra muitos
    @JoinColumn(name = "combustivel_id") //adiciona chave estrangeira
    private Combustivel tipoCombustivel;
    
    @OneToMany(mappedBy = "bomba", fetch = FetchType.EAGER) //indica o gerenciamento na relação, permite exibição da lista de abastecimentos em bomba
    @JsonManagedReference //serializa a lista de abastecimentos
    private List<Abastecimento> abastecimentos;
}
