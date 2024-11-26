package com.falar.falar.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class ArasaacService {

    private final RestTemplate restTemplate;

    public ArasaacService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public byte[] fetchPictogramImage(String id, String keyword) {
        String url = String.format("https://static.arasaac.org/pictograms/%s/%s.png", id, keyword);
        try {
            return restTemplate.getForObject(url, byte[].class);
        } catch (HttpClientErrorException.NotFound e) {
            throw new RuntimeException("Pictograma não encontrado para o ID: " + id + " e palavra-chave: " + keyword);
        }
    }
}