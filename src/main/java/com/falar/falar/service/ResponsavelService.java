package com.falar.falar.service;

import java.util.List;

import com.falar.falar.model.Responsavel;

public interface ResponsavelService {

    Responsavel salvarResponsavel(Responsavel responsavel);

    List<Responsavel> listarResponsaveis();

    Responsavel buscarResponsavelPorId(Long id);

    void deletarResponsavel(Long id);
}
