package com.falar.falar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Acessorado extends Usuario {

    @ManyToOne
    @JoinColumn(name = "responsavel_id") // Nome da coluna de chave estrangeira no banco de dados
    private Responsavel responsavel;

    private Integer code;
    private String comorbidade;
    private Integer idade;
}
