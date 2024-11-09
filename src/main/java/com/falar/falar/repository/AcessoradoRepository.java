package com.falar.falar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.falar.falar.model.Acessorado;

@Repository
public interface AcessoradoRepository extends JpaRepository<Acessorado, Long> {

    List<Acessorado> findByResponsavelId(Long responsavelId);
}
