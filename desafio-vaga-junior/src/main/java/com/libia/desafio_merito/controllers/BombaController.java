package com.libia.desafio_merito.controllers;

import com.libia.desafio_merito.entidades.Bomba;
import com.libia.desafio_merito.repository.BombaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author libia
 */
@RestController //indica que lida com requisições HTTP
@RequestMapping("/bombas") //define caminho de acesso aos métodos
@Transactional //traz consistência em caso de falha de requisição

public class BombaController {
    @Autowired //injeção automática do repositório, permite o "plug-and-play" do Spring
    private BombaRepository repository;

    @GetMapping //rota para MOSTRAR as informações
    public List<Bomba> getAll() {
        return repository.findAll();
    }
    
    @PostMapping //rota para INSERIR novas informações
    public Bomba create(@RequestBody Bomba bomba) {
        return repository.save(bomba);
    }
}
