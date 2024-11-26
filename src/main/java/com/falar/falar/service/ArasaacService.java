package com.falar.falar.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ArasaacService {

    private final RestTemplate restTemplate;

    public ArasaacService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public byte[] fetchPictogramImage(String id, String keyword) {
        String url = String.format("https://static.arasaac.org/pictograms/%s/%s.png", id, keyword);
        return restTemplate.getForObject(url, byte[].class);
    }
}