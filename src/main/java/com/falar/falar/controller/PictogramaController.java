package com.falar.falar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.falar.falar.service.PictogramaService;

@Controller
@RequestMapping("/api/pictogramas_save")
public class PictogramaController {

    private final PictogramaService pictogramaService;

    public PictogramaController(PictogramaService pictogramaService) {
        this.pictogramaService = pictogramaService;
    }

    @PostMapping("/{id}/{keyword}")
    public ResponseEntity<?> salvarPictograma(
            @PathVariable String id,
            @PathVariable String keyword,
            @RequestBody String nome) {
        try {
            pictogramaService.salvarPictograma(id, keyword, nome);
            return ResponseEntity.ok("Pictograma salvo com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao salvar o pictograma: " + e.getMessage());
        }
    }

}
