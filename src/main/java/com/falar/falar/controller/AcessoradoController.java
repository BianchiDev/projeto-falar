package com.falar.falar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.falar.falar.model.Acessorado;
import com.falar.falar.repository.AcessoradoRepository;
import com.falar.falar.repository.ResponsavelRepository;

@RestController
@RequestMapping("/acessorados")
public class AcessoradoController {

    @Autowired
    private AcessoradoRepository acessoradoRepository;

    @Autowired
    private ResponsavelRepository responsavelRepository;

    @GetMapping
    public List<Acessorado> getAllAcessorados() {
        return acessoradoRepository.findAll();
    }

    @PostMapping
    public Acessorado createAcessorado(@RequestBody Acessorado acessorado) {
        return acessoradoRepository.save(acessorado);
    }

    @GetMapping("/{id}")
    public Acessorado getAcessoradoById(@PathVariable Long id) {
        return acessoradoRepository.findById(id).orElseThrow(() -> new RuntimeException("Acessorado não encontrado"));
    }

    @PutMapping("/{id}")
    public Acessorado updateAcessorado(@PathVariable Long id, @RequestBody Acessorado acessoradoAtualizado) {
        Acessorado acessorado = acessoradoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Acessorado não encontrado"));

        acessorado.setNome(acessoradoAtualizado.getNome());
        acessorado.setResponsavel(acessoradoAtualizado.getResponsavel());

        return acessoradoRepository.save(acessorado);
    }

    @DeleteMapping("/{id}")
    public void deleteAcessorado(@PathVariable Long id) {
        acessoradoRepository.deleteById(id);
    }

    // Endpoint para obter acessorados de um responsável específico
    @GetMapping("/responsavel/{responsavelId}")
    public List<Acessorado> getAcessoradosByResponsavel(@PathVariable Long responsavelId) {
        return acessoradoRepository.findByResponsavelId(responsavelId);
    }
}
