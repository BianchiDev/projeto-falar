package com.falar.falar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.falar.falar.service.ArasaacService;

@Controller
public class ArasaacController {
    @Autowired
    private ArasaacService arasaacService;

    @GetMapping("/api/pictograms/{id}/{keyword}.png")
    public ResponseEntity<byte[]> getPictogramImage(@PathVariable String id, @PathVariable String keyword) {
        byte[] image = arasaacService.fetchPictogramImage(id, keyword);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "image/png");
        return new ResponseEntity<>(image, headers, HttpStatus.OK);
    }
}
