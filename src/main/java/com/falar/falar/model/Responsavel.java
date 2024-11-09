package com.falar.falar.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class Responsavel extends Usuario {

    private String telefone;
    private Integer idade;

    @Column(name = "nome_dependente")
    private String nomeDoDependente;

    @OneToMany(mappedBy = "responsavel", cascade = CascadeType.ALL)
    private List<Acessorado> acessorados;
}
