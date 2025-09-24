package com.libia.desafio_merito.controllers;

import com.libia.desafio_merito.entidades.Combustivel;
import com.libia.desafio_merito.repository.CombustivelRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author libia
 */
@RestController//indica que lida com requisições HTTP
@RequestMapping("/combustiveis") //define caminho de acesso aos métodos
@Transactional //traz consistência em caso de falha de requisição

public class CombustivelController {
    @Autowired //injeção automática do repositório, permite o "plug-and-play" do Spring
    private CombustivelRepository repository;

    @GetMapping //rota para MOSTRAR as informações
    public List<Combustivel> getAll() {
        return repository.findAll();
    }

    @PostMapping //rota para INSERIR as informações
    public Combustivel create(@RequestBody Combustivel combustivel) {
        return repository.save(combustivel);
    }

    @PutMapping("/{id}") //rota para ATUALIZAR as informações
    public Combustivel update(@PathVariable Long id, @RequestBody Combustivel combustivel) {
        combustivel.setId(id);
        return repository.save(combustivel);
    }

    @DeleteMapping("/{id}") //rota para DELETAR as informações
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
