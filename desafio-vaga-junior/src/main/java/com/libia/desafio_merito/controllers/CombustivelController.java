package com.libia.desafio_merito.controllers;

import com.libia.desafio_merito.entidades.Combustivel;
import com.libia.desafio_merito.repository.CombustivelRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author libia
 */
@RestController
@RequestMapping("/combustiveis")
public class CombustivelController {
    @Autowired
    private CombustivelRepository repository;

    @GetMapping
    public List<Combustivel> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Combustivel create(@RequestBody Combustivel combustivel) {
        return repository.save(combustivel);
    }

    @PutMapping("/{id}")
    public Combustivel update(@PathVariable Long id, @RequestBody Combustivel combustivel) {
        combustivel.setId(id);
        return repository.save(combustivel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
