package com.falar.falar.service;

import org.springframework.stereotype.Service;

import com.falar.falar.model.Pictograma;
import com.falar.falar.repository.PictogramaRepository;

@Service
public class PictogramaService {

    private final PictogramaRepository pictogramaRepository;
    private final ArasaacService arasaacService;

    public PictogramaService(PictogramaRepository pictogramaRepository, ArasaacService arasaacService) {
        this.pictogramaRepository = pictogramaRepository;
        this.arasaacService = arasaacService;
    }

    public void salvarPictograma(String id, String keyword, String nome) {
        // Busca a URL usando a classe de API
        byte[] imagemBytes = arasaacService.fetchPictogramImage(id, keyword);

        // Cria o objeto e salva no banco
        Pictograma pictograma = new Pictograma();
        pictograma.setNome(nome);
        pictograma.setImagem(imagemBytes);

        pictogramaRepository.save(pictograma);
    }
}
