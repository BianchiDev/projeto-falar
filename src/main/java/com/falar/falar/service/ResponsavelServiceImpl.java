package com.falar.falar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.falar.falar.model.Responsavel;
import com.falar.falar.repository.ResponsavelRepository;

@Service
public class ResponsavelServiceImpl implements ResponsavelService {
    @Autowired
    private ResponsavelRepository responsavelRepository;

    @Override
    public Responsavel salvarResponsavel(Responsavel responsavel) {
        return responsavelRepository.save(responsavel);
    }

    @Override
    public List<Responsavel> listarResponsaveis() {
        return responsavelRepository.findAll();
    }

    @Override
    public Responsavel buscarResponsavelPorId(Long id) {
        return responsavelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Responsável não encontrado com o ID: " + id));
    }

    @Override
    public void deletarResponsavel(Long id) {
        responsavelRepository.deleteById(id);
    }

}
