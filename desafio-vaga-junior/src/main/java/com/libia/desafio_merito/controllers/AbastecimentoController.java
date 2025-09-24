package com.libia.desafio_merito.controllers;

import com.libia.desafio_merito.entidades.Abastecimento;
import com.libia.desafio_merito.repository.AbastecimentoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author libia
 */
@RestController //indica que lida com requisições HTTP
@RequestMapping("/abastecimentos") //define caminho de acesso aos métodos
@Transactional //traz consistência em caso de falha de requisição

public class AbastecimentoController {
    @Autowired //injeção automática do repositório, permite o "plug-and-play" do Spring
    private AbastecimentoRepository repository;

    @GetMapping //rota para MOSTRAR as informações
    public List<Abastecimento> getAll() {
        return repository.findAll();
    }

    @PostMapping //rota para INSERIR as informações
    public Abastecimento create(@RequestBody Abastecimento abastecimento) {
        return repository.save(abastecimento);
    }
}
