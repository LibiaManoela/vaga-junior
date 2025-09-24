package com.libia.desafio_merito.service;

import com.libia.desafio_merito.entidades.*;
import com.libia.desafio_merito.repository.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author libia
 */
@Service //define a classe como serviço
public class AbastecimentoService {
    @Autowired //injeção automática do repositório, permite o "plug-and-play" do Spring
    private AbastecimentoRepository abastecimentoRepository;

    @Autowired
    private BombaRepository bombaRepository;

    @Transactional //traz consistência em caso de falha de requisição
    public Abastecimento criarAbastecimento(Abastecimento abastecimento) {
        if (abastecimento.getBomba() != null && abastecimento.getBomba().getId() != null) {
            Bomba bomba = bombaRepository.findById(abastecimento.getBomba().getId())
                    .orElseThrow(() -> new RuntimeException("Bomba não encontrada"));
            abastecimento.setBomba(bomba);
        }

        if (abastecimento.getLitros() != null && abastecimento.getBomba() != null && abastecimento.getBomba().getTipoCombustivel() != null) {
            Combustivel combustivel = abastecimento.getBomba().getTipoCombustivel();
            Double valorTotal = abastecimento.getLitros() * combustivel.getPrecoPorLitro();
            abastecimento.setValorTotal(valorTotal);
        }

        return abastecimentoRepository.save(abastecimento);
    }

    @Transactional(readOnly = true) //traz consistência em caso de falha de requisição e defini somente como leitura
    public List<Abastecimento> listarTodos() {
        return abastecimentoRepository.findAll();
    }
}