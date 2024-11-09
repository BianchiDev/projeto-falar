package com.falar.falar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.falar.falar.model.Responsavel;
import com.falar.falar.service.ResponsavelService;

@RestController
@RequestMapping("/responsaveis")
public class ResponsavelController {

    @Autowired
    private ResponsavelService responsavelService;

    @PostMapping
    public Responsavel criarResponsavel(@RequestBody Responsavel responsavel) {
        return responsavelService.salvarResponsavel(responsavel);
    }

    @GetMapping
    public List<Responsavel> listarResponsaveis() {
        return responsavelService.listarResponsaveis();
    }

    @GetMapping("/{id}")
    public Responsavel buscarResponsavel(@PathVariable Long id) {
        return responsavelService.buscarResponsavelPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarResponsavel(@PathVariable Long id) {
        responsavelService.deletarResponsavel(id);
    }
}
