/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.libia.desafio_merito.controllers;

import com.libia.desafio_merito.entidades.Combustivel;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 *
 * @author libia
 */
@RestController
@RequestMapping("/combustiveis")
public class CombustivelController {
    @GetMapping
    public List<Combustivel> getAll() {
        return Combustivel.getCombustiveis();
    }

    @PostMapping
    public Combustivel create(@RequestBody Combustivel combustivel) {
        combustivel.setId((long) (Combustivel.getCombustiveis().size() + 1));
        Combustivel.getCombustiveis().add(combustivel);
        return combustivel;
    }

    @PutMapping("/{id}")
    public Combustivel update(@PathVariable Long id, @RequestBody Combustivel combustivel) {
        Combustivel existing = Combustivel.getCombustiveis().stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
        if (existing != null) {
            Combustivel.getCombustiveis().remove(existing);
            combustivel.setId(id);
            Combustivel.getCombustiveis().add(combustivel);
            return combustivel;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Combustivel.getCombustiveis().removeIf(c -> c.getId().equals(id));
    }
}
